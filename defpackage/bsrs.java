package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bsrs extends dqpg {
    public long a;
    public long b;
    public String c;
    public String d;
    public anqd e;
    public chpw f;
    public String g;
    public String h;
    public String i;
    public Uri j;
    public String k;
    public String l;
    public String m;
    public String n;
    public boolean o;
    public boolean p;
    public long q;
    public long r;
    public boolean s;
    public long t;

    public bsrs() {
        super(ProfilesTable.f());
        this.e = anqd.a;
        this.o = true;
        this.p = false;
        this.q = 0L;
        this.r = 0L;
        this.s = false;
        this.t = 0L;
    }

    public final ProfilesTable.BindData a() {
        bsrr bsrrVar = new bsrr();
        bsrrVar.aD(aB());
        bsrrVar.a = this.a;
        bsrrVar.b = this.b;
        bsrrVar.c = this.c;
        bsrrVar.d = this.d;
        bsrrVar.e = this.e;
        bsrrVar.f = this.f;
        bsrrVar.g = this.g;
        bsrrVar.h = this.h;
        bsrrVar.i = this.i;
        bsrrVar.j = this.j;
        bsrrVar.k = this.k;
        bsrrVar.l = this.l;
        bsrrVar.m = this.m;
        bsrrVar.n = this.n;
        bsrrVar.o = this.o;
        bsrrVar.p = this.p;
        bsrrVar.q = this.q;
        bsrrVar.r = this.r;
        bsrrVar.s = this.s;
        bsrrVar.t = this.t;
        bsrrVar.cM = aC();
        return bsrrVar;
    }

    public final void b(boolean z) {
        int i = this.aB;
        if (i < 59940) {
            dqru.x("belongs_to_self_gaia", i);
        }
        aE(18);
        this.s = z;
    }

    public final void c(String str) {
        aE(12);
        this.m = str;
    }

    public final void d(String str) {
        aE(8);
        this.i = str;
    }

    public final void e(String str) {
        aE(6);
        this.g = str;
    }

    public final void f(long j) {
        int i = this.aB;
        if (i < 59940) {
            dqru.x("gaia_update_timestamp", i);
        }
        aE(19);
        this.t = j;
    }

    public final void g(boolean z) {
        int i = this.aB;
        if (i < 60400) {
            dqru.x("is_self_profile_shareable", i);
        }
        aE(14);
        this.o = z;
    }

    public final void h(String str) {
        aE(7);
        this.h = str;
    }

    public final void i(long j) {
        aE(1);
        this.b = j;
    }

    public final void j(String str) {
        int i = this.aB;
        if (i < 60170) {
            dqru.x("person_id", i);
        }
        aE(2);
        this.c = str;
    }

    public final void k(String str) {
        aE(13);
        this.n = str;
    }

    public final void l(Uri uri) {
        aE(9);
        this.j = uri;
    }

    public final void m(String str) {
        int i = this.aB;
        if (i < 60170) {
            dqru.x("profile_access_token", i);
        }
        aE(3);
        this.d = str;
    }

    public final void n(chpw chpwVar) {
        int i = this.aB;
        if (i < 60340) {
            dqru.x("self_profile_sharing_metadata", i);
        }
        aE(5);
        this.f = chpwVar;
    }

    public final void o(String str) {
        int i = this.aB;
        if (i < 60170) {
            dqru.x("sender_last_updated_time", i);
        }
        aE(10);
        this.k = str;
    }

    public final void p(String str) {
        int i = this.aB;
        if (i < 60200) {
            dqru.x("sender_last_updated_time_from_rcs", i);
        }
        aE(11);
        this.l = str;
    }
}
