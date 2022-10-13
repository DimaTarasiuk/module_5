package com.prosalyte.patterns.behavioral.chainOfResponsibility;

public class BugTracker {
    public static void main(String[] args) {
        Notifier reportNotifier =new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier =new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier =new SMSNotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        reportNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyManager("Everything is ok", Priority.ROUTINE);
        reportNotifier.notifyManager("Somth happened", Priority.IMPORTANT);
        reportNotifier.notifyManager("Blocker inc", Priority.ASAP);

    }
}
