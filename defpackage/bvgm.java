package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvgm {
    private static final ekhv a;
    private final afhk b;

    static {
        ekhv ekhvVar = new ekhv();
        ekhvVar.c("_id");
        ekhvVar.c("conversation_id");
        ekhvVar.c("sender_id");
        ekhvVar.c("message_status");
        ekhvVar.c("message_protocol");
        ekhvVar.c("received_timestamp");
        ekhvVar.c("web_id");
        ekhvVar.c("message_report_status");
        ekhvVar.c("participant_id");
        ekhvVar.c("read_time");
        ekhvVar.c("participant_id");
        ekhvVar.c("read_time");
        ekhvVar.c("receive_time");
        String[] strArr = buyx.a;
        ekhvVar.c("user_references");
        String[] strArr2 = PartsTable.a;
        ekhvVar.c("parts");
        String[] strArr3 = btbt.a;
        ekhvVar.c("read_reports");
        a = ekhvVar;
    }

    public bvgm(afhk afhkVar) {
        this.b = afhkVar;
    }

    final ekhx a() {
        ekhv ekhvVar = a;
        if (this.b.c()) {
            String[] strArr = bpxj.a;
            ekhvVar.c("link_preview");
        }
        return ekhvVar.g();
    }
}
