package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dqpd;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bkva extends dqpd {
    public String a;
    public MessageIdType b = bary.a;
    public long[] c;
    public long[] d;
    public long[] e;
    public Optional[] f;
    public long[] g;

    protected bkva() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "ReadReportsConcatView [read_reports.read_reports__id: %s,\n  read_reports.read_reports_message_id: %s,\n  read_reports.read_reports_participant_id: %s,\n  read_reports.read_reports_receive_time: %s,\n  read_reports.read_reports_read_time: %s,\n  read_reports.read_reports_ftd_time: %s,\n  read_reports.read_reports_rowid: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), aK(this.c), aK(this.d), aK(this.e), aL(this.f), aK(this.g));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        Integer.valueOf(bkvv.b().a()).getClass();
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bkvu bkvuVar = (bkvu) dqqjVar;
        aC();
        this.cN = bkvuVar.cV();
        if (bkvuVar.dj(0)) {
            this.a = bkvuVar.getString(bkvuVar.cO(0, bkvv.a));
            fN(0);
        }
        if (bkvuVar.dj(1)) {
            this.b = new MessageIdType(bkvuVar.getLong(bkvuVar.cO(1, bkvv.a)));
            fN(1);
        }
        if (bkvuVar.dj(2)) {
            this.c = dqru.C(null, bkvu.dt(bkvuVar.getString(bkvuVar.cO(2, bkvv.a))));
            fN(2);
        }
        if (bkvuVar.dj(3)) {
            this.d = dqru.C(null, bkvu.dt(bkvuVar.getString(bkvuVar.cO(3, bkvv.a))));
            fN(3);
        }
        if (bkvuVar.dj(4)) {
            this.e = dqru.C(null, bkvu.dt(bkvuVar.getString(bkvuVar.cO(4, bkvv.a))));
            fN(4);
        }
        if (bkvuVar.dj(5)) {
            long[] jArrDt = bkvu.dt(bkvuVar.getString(bkvuVar.cO(5, bkvv.a)));
            int length = jArrDt.length;
            Optional[] optionalArr = new Optional[length];
            for (int i = 0; i < length; i++) {
                optionalArr[i] = basb.b(jArrDt[i]);
            }
            this.f = (Optional[]) dqru.D(null, optionalArr, new Optional[0]);
            fN(5);
        }
        if (bkvuVar.dj(6)) {
            this.g = dqru.C(null, bkvu.dt(bkvuVar.getString(bkvuVar.cO(6, bkvv.a))));
            fN(6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bkva)) {
            return false;
        }
        bkva bkvaVar = (bkva) obj;
        return super.aE(bkvaVar.cN) && Objects.equals(this.a, bkvaVar.a) && Objects.equals(this.b, bkvaVar.b) && Arrays.equals(this.c, bkvaVar.c) && Arrays.equals(this.d, bkvaVar.d) && Arrays.equals(this.e, bkvaVar.e) && Arrays.equals(this.f, bkvaVar.f) && Arrays.equals(this.g, bkvaVar.g);
    }

    public final long[] f() {
        aA(2, "participant_id");
        return this.c;
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.d)), Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.hashCode(this.f)), Integer.valueOf(Arrays.hashCode(this.g)), null);
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "ReadReportsConcatView -- REDACTED") : a();
    }
}
