package org.comp3046.it9.UI.Menu;

import org.comp3046.it9.Database.CustomerDb;
import org.comp3046.it9.Database.Sqlite;
import org.comp3046.it9.Entity.Customer;
import org.comp3046.it9.Entity.Staff;
import org.comp3046.it9.UI.Login.LoginFrame;
import org.comp3046.it9.UI.Member.MemberSetting;
import org.comp3046.it9.UI.MovieAction.MovieSetting;
import org.comp3046.it9.UI.TransactionRecord.TransactionRecord;
import org.jooq.exception.DataAccessException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class StaffMenu {

    private JLabel lblLoginer;
    private final TopBar tb;
    private final JFrame frame;
    private JSeparator separator;
    private JButton btnAddMember, btnAddMovie, btnModifyMember, btnModifyMovie, btnTransactionRecord;
    private JButton btnLogout;
    private JPanel topbar;

    private final LoginFrame loginFrame;
    private Staff staff = null;

    /**
     * Create the application.
     */
    public StaffMenu(LoginFrame loginFrame, Staff staff) {
        this.loginFrame = loginFrame;
        this.staff = staff;
        frame = new JFrame();
        frame.setBounds(100, 100, 524, 457);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("XXX Cinema - Menu");
        frame.getContentPane().setLayout(null);
        tb = new TopBar();
        initialize();
        tb.clock();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame.setVisible(true);

        topbar = new JPanel();
        topbar.setLayout(null);
        topbar.setBounds(0, 0, 504, 40);

        lblLoginer = new JLabel("Login as ");
        lblLoginer.setText(lblLoginer.getText() + this.staff.getName() + "-Staff");
        lblLoginer.setBounds(308, 10, 200, 15);

        lblLoginer.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
        topbar.add(lblLoginer);

        separator = new JSeparator();
        separator.setBounds(10, 35, 534, 2);
        topbar.add(separator);

        frame.getContentPane().add(tb.topbarLayout(topbar, this.staff.getId() + "", this.staff.getName()));

        btnAddMember = new JButton("Add Member");
        btnAddMember.setBounds(20, 47, 215, 93);
        btnAddMember.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
        btnAddMember.addActionListener(new AddMemberAction());
        frame.getContentPane().add(btnAddMember);

        btnAddMovie = new JButton("Add Movie");
        btnAddMovie.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
        btnAddMovie.setBounds(272, 47, 215, 93);
        btnAddMovie.addActionListener(new AddMovieAction());
        frame.getContentPane().add(btnAddMovie);

        btnModifyMember = new JButton("Modify Member");
        btnModifyMember.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
        btnModifyMember.setBounds(20, 163, 215, 93);
        btnModifyMember.addActionListener(new ModifyMemberAction());
        frame.getContentPane().add(btnModifyMember);

        btnModifyMovie = new JButton("Modify Movie");
        btnModifyMovie.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
        btnModifyMovie.setBounds(272, 163, 215, 93);
        btnModifyMovie.addActionListener(new ModifyMovieAction());
        frame.getContentPane().add(btnModifyMovie);

        btnTransactionRecord = new JButton("Transaction Record");
        btnTransactionRecord.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 30));
        btnTransactionRecord.addActionListener(new TransactionRecordAction());
        btnTransactionRecord.setBounds(129, 276, 266, 93);
        frame.getContentPane().add(btnTransactionRecord);

        btnLogout = new JButton("Logout");
        btnLogout.setBounds(218, 385, 88, 23);
        btnLogout.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 15));
        btnLogout.addActionListener(new LogoutAction());
        frame.getContentPane().add(btnLogout);
    }

    public void setVisible(boolean visible) {
        frame.setVisible(visible);
    }

    private StaffMenu getSelf() {
        return this;
    }

    public Staff getStaff() {
        return this.staff;
    }

    private class AddMemberAction implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            new MemberSetting(getSelf());
            setVisible(false);
        }
    }

    private class AddMovieAction implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            new MovieSetting(getSelf());
            setVisible(false);
        }
    }

    private class ModifyMemberAction implements ActionListener {
        public void actionPerformed(ActionEvent event) {

            String member_id = JOptionPane.showInputDialog(frame, "Enter the Member ID");

            Customer fetchCustomer;
            try (Sqlite sqlite = new Sqlite()) {
                int mid = Integer.parseInt(member_id, 10);

                CustomerDb customerDb = new CustomerDb(sqlite);

                fetchCustomer = customerDb.getCustomerByUid(mid);
            } catch (NumberFormatException ignored) {
                JOptionPane.showMessageDialog(null, "Input member ID is not an integer.", "Modify member", JOptionPane.WARNING_MESSAGE);
                return;
            } catch (FileNotFoundException ignored) {
                JOptionPane.showMessageDialog(null, "Error: \r\n\r\nMissing database file.", "Modify member", JOptionPane.ERROR_MESSAGE);
                return;
            } catch (DataAccessException | SQLException | IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error: \r\n\r\n" + e.getMessage(), "Modify member", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (fetchCustomer == null) {
                JOptionPane.showMessageDialog(null, "Member not found.", "Modify member", JOptionPane.WARNING_MESSAGE);
                return;
            }

            // check the member id is true

            new MemberSetting(getSelf(), fetchCustomer);
            setVisible(false);
        }
    }

    private class ModifyMovieAction implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            new MovieSetting(getSelf(), null);
            setVisible(false);
        }
    }

    private class TransactionRecordAction implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            new TransactionRecord(getSelf());
            setVisible(false);
        }
    }

    private class LogoutAction implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            loginFrame.setVisible(true);
            frame.dispose();
        }
    }

}
