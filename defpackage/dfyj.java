package defpackage;

import android.content.Context;
import com.google.android.ims.provisioning.config.ConfirmationConfiguration;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import j$.util.Objects;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfyj implements dfys {
    public static final dfny a = dfod.a(188291725);
    private static final dfny v = dfod.a(192639545);
    public dfyx b;
    public final ebkz c;
    protected final dgwa d;

    @Deprecated
    public final dgit e;
    public final dgim f;
    public dgiq g;
    public final dfyr h;
    public final String i;
    public final dhgm k;
    public final dhip l;
    public final dgfs m;
    public final eblg n;
    public final dfze o;
    public final dfyy p;
    public final dhjt q;
    public final dhej r;
    public final dfcg s;
    private dgft w;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public final List t = new CopyOnWriteArrayList();
    public final dfzi u = new dfyh(this);

    public dfyj(dfyr dfyrVar, String str, dgiq dgiqVar, dfcg dfcgVar, dhip dhipVar, Context context, eblg eblgVar, ebkz ebkzVar, dgfs dgfsVar, dgwa dgwaVar, dfze dfzeVar, dhej dhejVar, dfyy dfyyVar, dhjt dhjtVar, eosd eosdVar) {
        this.s = dfcgVar;
        this.l = dhipVar;
        this.i = str;
        this.h = dfyrVar;
        this.n = eblgVar;
        this.c = ebkzVar;
        this.g = dgiqVar;
        this.e = new dgit(dgiqVar.m(), dgiqVar.e());
        this.f = new dgim(dgiqVar, dgiqVar.e());
        this.k = new dhgm(dhipVar, dfht.a(context.getApplicationContext(), dhipVar.a.concat(".ims_refreshable_manager")), eosdVar);
        this.o = dfzeVar;
        this.m = dgfsVar;
        this.d = dgwaVar;
        this.r = dhejVar;
        this.p = dfyyVar;
        this.q = dhjtVar;
        dhja.l(dhipVar, "IMS module has been created", new Object[0]);
        dfyrVar.onImsModuleInitialized();
    }

    private final void o() {
        dgiq dgiqVar;
        if (!((Boolean) v.a()).booleanValue() || (dgiqVar = this.g) == null || dgiqVar.m() == null) {
            return;
        }
        if (this.g.m().equals(dfog.J() ? this.f.a.m() : this.e.a)) {
            return;
        }
        dhja.r(this.l, "IMS configuration has been updated after Configuration is updated.", new Object[0]);
        this.g.D(ImsConfiguration.a(dfog.J() ? this.f.a.m() : this.e.a));
    }

    @Override // defpackage.dfys
    public final ConfirmationConfiguration a() {
        return this.g.l();
    }

    @Override // defpackage.dfys
    public final dgiq b() {
        o();
        return this.g;
    }

    @Override // defpackage.dfys
    public final ImsConfiguration c() {
        o();
        return this.g.n();
    }

    @Override // defpackage.dfys
    public final InstantMessageConfiguration d() {
        return this.g.o();
    }

    @Override // defpackage.dfys
    public final String e() {
        dfyx dfyxVar = this.b;
        return dfyxVar == null ? dfog.J() ? this.f.a.m().w() : this.e.a.w() : dfyxVar.d();
    }

    public final void f(dfzi dfziVar) {
        this.t.add(dfziVar);
    }

    public final void g(dezf dezfVar) {
        this.h.onImsModuleStartFailed(dezfVar);
    }

    public final void h(dezf dezfVar) {
        this.h.onImsModuleStopped(dezfVar);
    }

    public final void i(dezf dezfVar) {
        if (!this.j.get()) {
            dhja.r(this.l, "IMS module not started yet", new Object[0]);
            return;
        }
        dfyx dfyxVar = this.b;
        dfyxVar.getClass();
        dfyxVar.g(dezfVar);
    }

    public final synchronized void j(int i) {
        if (this.c == null) {
            dhja.h(this.l, "ImsServiceDispatcher is null, should be set before calling start", new Object[0]);
            return;
        }
        AtomicBoolean atomicBoolean = this.j;
        if (atomicBoolean.get()) {
            dhja.r(this.l, "IMS module already started", new Object[0]);
            return;
        }
        if (this.g.U() && this.g.Z()) {
            dhja.r(this.l, "Reconfiguration required. Aborting IMS module start.", new Object[0]);
            g(dezf.RECONFIGURATION_REQUIRED);
            return;
        }
        try {
            dhip dhipVar = this.l;
            dhja.d(dhipVar, "Start the IMS module", new Object[0]);
            dhja.l(dhipVar, "Starting IMS dispatcher", new Object[0]);
            atomicBoolean.set(true);
            if (Objects.isNull(this.b)) {
                dhja.h(dhipVar, "ImsRegistrationController is null, should be set before calling start", new Object[0]);
                atomicBoolean.set(false);
                return;
            }
            this.b.i(i);
            if (this.w == null) {
                dfyi dfyiVar = new dfyi(this);
                this.w = dfyiVar;
                this.m.b(dfyiVar);
            }
            dhja.l(dhipVar, "IMS module started", new Object[0]);
        } catch (Exception e) {
            dhja.j(e, this.l, "Error while starting IMS module: %s", e.getMessage());
            this.j.set(false);
        }
    }

    @Override // defpackage.dfys
    public final synchronized void k(dezf dezfVar) {
        AtomicBoolean atomicBoolean = this.j;
        if (!atomicBoolean.get()) {
            dhja.r(this.l, "IMS module not started yet", new Object[0]);
            return;
        }
        dhip dhipVar = this.l;
        dhja.d(dhipVar, "Stop the IMS module due to %s", dezfVar);
        atomicBoolean.set(false);
        dgft dgftVar = this.w;
        if (dgftVar != null) {
            this.m.g(dgftVar);
            this.w = null;
        }
        this.d.g(dezfVar);
        dfyx dfyxVar = this.b;
        dfyxVar.getClass();
        dfyxVar.j(dezfVar);
        dhja.l(dhipVar, "IMS module stopped", new Object[0]);
        if (((Boolean) a.a()).booleanValue()) {
            return;
        }
        h(dezfVar);
    }

    public final void l(dgiq dgiqVar) {
        dhja.d(this.l, "Updating RCS configuration to %d", Integer.valueOf(dgiqVar.e()));
        this.g = dgiqVar;
        if (dfog.J()) {
            this.f.a(dgiqVar, dgiqVar.e());
        } else {
            this.e.a(dgiqVar.m(), dgiqVar.e());
        }
    }

    @Override // defpackage.dfys
    public final boolean m() {
        dfyx dfyxVar = this.b;
        if (dfyxVar == null) {
            return false;
        }
        return dfyxVar.l();
    }

    public final boolean n() {
        return this.j.get();
    }
}
