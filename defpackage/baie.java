package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import defpackage.bbbd;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class baie extends bajr {
    public final Uri a;
    public final String b;
    private final String d;
    private final long e;
    private final String f;
    private final long g;
    private final alqm h;
    private final boolean i;
    private final Optional j = Optional.empty();

    public baie(axjf axjfVar, alrj alrjVar, ParticipantsTable.BindData bindData) {
        String strJ;
        ProfilesTable.BindData bindData2;
        this.a = axjfVar.a(bindData);
        this.e = bindData.u();
        this.f = bindData.S();
        this.g = bindData.v();
        alqm alqmVarQ = alrjVar.q(bindData);
        this.h = alqmVarQ;
        boolean zD = bbbe.d(bindData);
        this.i = zD;
        bindData.D();
        if (!TextUtils.isEmpty(bindData.Q())) {
            this.b = bindData.Q();
            this.d = bbbd.m(bindData) ? null : bindData.V();
            return;
        }
        String strA = (!bindData.aF("profiles_table_join_tag") || (bindData2 = (ProfilesTable.BindData) bindData.ax("profiles_table_join_tag", ProfilesTable.BindData.class)) == null || TextUtils.isEmpty(bindData2.v())) ? null : chsk.a(bindData2.v());
        if (strA != null) {
            this.d = strA;
        } else {
            this.d = null;
        }
        if (zD) {
            strJ = alqmVarQ.F().a;
        } else {
            int i = bbbd.a;
            alrj alrjVar2 = (alrj) ((bbbd.a) cqtf.a(bbbd.a.class)).D().b();
            strJ = bbbd.j(alrjVar2.t(bindData), alrjVar2);
            String strK = bindData.K();
            if (!TextUtils.isEmpty(strK)) {
                strJ = String.format("%s (%s)", strJ, strK);
            }
        }
        this.b = strJ;
    }

    @Override // defpackage.bajr
    public final long a() {
        return this.e;
    }

    @Override // defpackage.bajr
    public final long b() {
        return this.g;
    }

    @Override // defpackage.bajr
    public final Intent c() {
        return null;
    }

    @Override // defpackage.bajr
    public final Uri d() {
        return this.a;
    }

    @Override // defpackage.bajr
    public final Optional e() {
        return Optional.of(this.h);
    }

    @Override // defpackage.bajr
    public final Optional k() {
        return this.j;
    }

    @Override // defpackage.bajr
    public final String l() {
        return this.d;
    }

    @Override // defpackage.bajr
    public final String m() {
        return this.b;
    }

    @Override // defpackage.bajr
    public final String n() {
        return this.f;
    }
}
