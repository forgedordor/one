package defpackage;

import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.provider.Telephony;
import android.text.TextUtils;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmny extends cmoa {
    private static String[] z;
    private int A;
    public String a;
    public long b;
    public int c;
    public String d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public int j;
    public int k;
    public boolean l;
    public boolean m;
    public String n;
    public String o;
    public long p;
    public int q;
    public alqm r;
    public cmqi s;
    public int t;
    public int u;
    public String v;
    public Optional w;
    public final List x = new ArrayList();
    public boolean y = false;

    private cmny() {
    }

    public static cmny h(Cursor cursor, int i) {
        cmny cmnyVar = new cmny();
        cmnyVar.b = cursor.getLong(0);
        cmnyVar.c = cursor.getInt(1);
        cmnyVar.d = cursor.getString(2);
        cmnyVar.e = cursor.getInt(3);
        if (!TextUtils.isEmpty(cmnyVar.d)) {
            cmnyVar.d = cmod.a(cmod.b(cmnyVar.d, 4), cmnyVar.e);
        }
        cmnyVar.f = cursor.getLong(4);
        cmnyVar.g = cursor.getLong(5) * 1000;
        cmnyVar.h = cursor.getLong(6) * 1000;
        cmnyVar.i = cursor.getLong(7);
        cmnyVar.j = cursor.getInt(8);
        cmnyVar.k = cursor.getInt(9);
        cmnyVar.l = cursor.getInt(10) != 0;
        cmnyVar.m = cursor.getInt(11) != 0;
        cmnyVar.n = cursor.getString(12);
        cmnyVar.o = cursor.getString(13);
        cmnyVar.A = cursor.getInt(14);
        cmnyVar.p = cursor.getLong(15) * 1000;
        cmnyVar.t = cursor.getInt(16);
        cmnyVar.u = cursor.getInt(17);
        cmnyVar.v = cursor.getString(18);
        if (((Boolean) ((cczi) cnrt.h.get()).e()).booleanValue()) {
            cmnyVar.w = Optional.ofNullable(chxx.c(cmnyVar.o));
        } else {
            cmnyVar.w = Optional.empty();
        }
        cmnyVar.x.clear();
        cmnyVar.y = false;
        cmnyVar.a = ContentUris.withAppendedId(Telephony.Mms.CONTENT_URI, cmnyVar.b).toString();
        int i2 = cursor.getInt(21);
        if (i2 >= 0) {
            i = i2;
        }
        cmnyVar.q = i;
        return cmnyVar;
    }

    public static String[] n() {
        if (z == null) {
            z = new String[]{"_id", "msg_box", "sub", "sub_cs", "m_size", "date", "date_sent", "thread_id", "pri", "st", "read", "seen", "ct_l", "tr_id", "m_type", "exp", "resp_st", "retr_st", "retr_txt", "m_id", "ct_cls", "sub_id"};
        }
        return z;
    }

    @Override // defpackage.cmnu
    public final int a() {
        return 1;
    }

    @Override // defpackage.cmnu
    public final int b() {
        return this.k;
    }

    @Override // defpackage.cmnu
    public final long c() {
        return this.g;
    }

    @Override // defpackage.cmnu
    public final String d() {
        return this.a;
    }

    @Override // defpackage.cmoa
    public final int e() {
        return this.q;
    }

    @Override // defpackage.cmoa
    public final long f() {
        return this.i;
    }

    public final Uri g() {
        String str = this.a;
        if (str == null) {
            return null;
        }
        return Uri.parse(str);
    }

    public final void i(cmnz cmnzVar) {
        this.x.add(cmnzVar);
    }

    public final boolean j() {
        return this.A == 130;
    }

    public final boolean k() {
        return this.c != 1;
    }

    public final boolean l() {
        Optional optional = this.w;
        if (optional == null || !optional.isPresent()) {
            return false;
        }
        return ((chxw) this.w.get()).f().isPresent();
    }

    public final boolean m() {
        List list = this.x;
        return list.size() == 1 && ((cmnz) list.get(0)).d();
    }
}
