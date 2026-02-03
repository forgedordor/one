package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cssd {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/text/GroupNameValueFilter");

    /* compiled from: PG */
    public interface a {
        csrx cV();

        ains w();
    }

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        csrx csrxVarCV = ((a) cqtf.a(a.class)).cV();
        ains ainsVarW = ((a) cqtf.a(a.class)).w();
        if (!ejwh.a(str, csrxVarCV.a(str))) {
            ekrd ekrdVar = (ekrd) a.j();
            ekrdVar.Z(eksk.MEDIUM);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/util/text/GroupNameValueFilter", "analyzeForBase32GroupName", 64, "GroupNameValueFilter.java")).q("Conversation has a base32-encoded conversation name");
            ainsVarW.c("Bugle.Conversations.GroupNameInvalid.Count");
        }
        return str;
    }
}
