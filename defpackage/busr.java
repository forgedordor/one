package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class busr extends dqpd {
    public MessageIdType a = bary.a;
    public long[] b;
    public long[] c;
    public long[] d;
    public String[] e;
    public String[] f;
    public String[] g;
    public String[] h;
    public String[] i;
    public int[] j;
    public int[] k;
    public int[] l;
    public long[] m;

    protected busr() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "UserRefConcatView [user_references.user_references_message_id: %s,\n  user_references.user_references_user_ref_id: %s,\n  user_references.user_references_user_ref_datetime: %s,\n  user_references.user_references_rowid: %s,\n  null.user_ref_display_name: %s,\n  null.user_ref_profile_photo_uri: %s,\n  null.user_ref_full_name: %s,\n  null.user_ref_lookup_key: %s,\n  participants.participants_normalized_destination: %s,\n  participants.participants_color_palette_index: %s,\n  participants.participants_color_type: %s,\n  participants.participants_extended_color: %s,\n  participants.participants_rowid: %s\n]\n", String.valueOf(this.a), aK(this.b), aK(this.c), aK(this.d), "REDACTED", "REDACTED", "REDACTED", "REDACTED", aM(this.i), aJ(this.j), aJ(this.k), aJ(this.l), aK(this.m));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        Integer.valueOf(buxk.b().a()).getClass();
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        buxj buxjVar = (buxj) dqqjVar;
        aC();
        this.cN = buxjVar.cV();
        if (buxjVar.dj(0)) {
            this.a = new MessageIdType(buxjVar.getLong(buxjVar.cO(0, buxk.a)));
            fN(0);
        }
        if (buxjVar.dj(1)) {
            this.b = dqru.C(null, buxj.dt(buxjVar.getString(buxjVar.cO(1, buxk.a))));
            fN(1);
        }
        if (buxjVar.dj(2)) {
            this.c = dqru.C(null, buxj.dt(buxjVar.getString(buxjVar.cO(2, buxk.a))));
            fN(2);
        }
        if (buxjVar.dj(3)) {
            this.d = dqru.C(null, buxj.dt(buxjVar.getString(buxjVar.cO(3, buxk.a))));
            fN(3);
        }
        if (buxjVar.dj(4)) {
            this.e = (String[]) dqru.D(null, buxj.du(buxjVar.getString(buxjVar.cO(4, buxk.a))), new String[0]);
            fN(4);
        }
        if (buxjVar.dj(5)) {
            this.f = (String[]) dqru.D(null, buxj.du(buxjVar.getString(buxjVar.cO(5, buxk.a))), new String[0]);
            fN(5);
        }
        if (buxjVar.dj(6)) {
            this.g = (String[]) dqru.D(null, buxj.du(buxjVar.getString(buxjVar.cO(6, buxk.a))), new String[0]);
            fN(6);
        }
        if (buxjVar.dj(7)) {
            this.h = (String[]) dqru.D(null, buxj.du(buxjVar.getString(buxjVar.cO(7, buxk.a))), new String[0]);
            fN(7);
        }
        if (buxjVar.dj(8)) {
            String[] strArrDu = buxj.du(buxjVar.getString(buxjVar.cO(8, buxk.a)));
            for (int i = 0; i < strArrDu.length; i++) {
                strArrDu[i] = cssb.a(strArrDu[i]);
            }
            this.i = (String[]) dqru.D(null, strArrDu, new String[0]);
            fN(8);
        }
        if (buxjVar.dj(9)) {
            this.j = dqru.A(null, buxj.ds(buxjVar.getString(buxjVar.cO(9, buxk.a))));
            fN(9);
        }
        if (buxjVar.dj(10)) {
            this.k = dqru.A(null, buxj.ds(buxjVar.getString(buxjVar.cO(10, buxk.a))));
            fN(10);
        }
        if (buxjVar.dj(11)) {
            this.l = dqru.A(null, buxj.ds(buxjVar.getString(buxjVar.cO(11, buxk.a))));
            fN(11);
        }
        if (buxjVar.dj(12)) {
            this.m = dqru.C(null, buxj.dt(buxjVar.getString(buxjVar.cO(12, buxk.a))));
            fN(12);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof busr)) {
            return false;
        }
        busr busrVar = (busr) obj;
        return super.aE(busrVar.cN) && Objects.equals(this.a, busrVar.a) && Arrays.equals(this.b, busrVar.b) && Arrays.equals(this.c, busrVar.c) && Arrays.equals(this.d, busrVar.d) && Arrays.equals(this.e, busrVar.e) && Arrays.equals(this.f, busrVar.f) && Arrays.equals(this.g, busrVar.g) && Arrays.equals(this.h, busrVar.h) && Arrays.equals(this.i, busrVar.i) && Arrays.equals(this.j, busrVar.j) && Arrays.equals(this.k, busrVar.k) && Arrays.equals(this.l, busrVar.l) && Arrays.equals(this.m, busrVar.m);
    }

    public final long[] f() {
        aA(1, "user_ref_id");
        return this.b;
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, Integer.valueOf(Arrays.hashCode(this.b)), Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.d)), Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.hashCode(this.f)), Integer.valueOf(Arrays.hashCode(this.g)), Integer.valueOf(Arrays.hashCode(this.h)), Integer.valueOf(Arrays.hashCode(this.i)), Integer.valueOf(Arrays.hashCode(this.j)), Integer.valueOf(Arrays.hashCode(this.k)), Integer.valueOf(Arrays.hashCode(this.l)), Integer.valueOf(Arrays.hashCode(this.m)), null);
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "UserRefConcatView -- REDACTED") : a();
    }
}
