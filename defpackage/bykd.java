package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.bykd;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bykd extends cayv {
    public static final cqce a = cqce.g("BugleCms", "CmsBackupWorkHandler");
    public final Context b;
    public final axlf c;
    public final eosc d;
    public final aukz e;
    public final aipo f;
    public final eoqr g = new eoqr();
    private final eosc h;
    private final aurx i;
    private final cogw j;
    private final fcsu k;

    /* compiled from: PG */
    public interface a {
        byjm bp();
    }

    public bykd(Context context, axlf axlfVar, aukz aukzVar, aurx aurxVar, eosc eoscVar, eosc eoscVar2, cogw cogwVar, fcsu fcsuVar, aipo aipoVar) {
        this.b = context;
        this.c = axlfVar;
        this.e = aukzVar;
        this.i = aurxVar;
        this.d = eoscVar;
        this.h = eoscVar2;
        this.j = cogwVar;
        this.k = fcsuVar;
        this.f = aipoVar;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.c(Alert.DURATION_SHOW_INDEFINITELY);
        caxzVarL.b(caze.WORKMANAGER_ONLY);
        caxzVarL.f(pza.a);
        pzh pzhVar = new pzh();
        pzhVar.c(4);
        ((caxk) caxzVarL).a = pzhVar.a();
        caxzVarL.e(true);
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("CmsBackupWorkHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return byiv.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* synthetic */ eiju j(final cayy cayyVar, evuh evuhVar) {
        final byiv byivVar = (byiv) evuhVar;
        final int i = byivVar.d;
        final String str = byivVar.e;
        final int i2 = byivVar.c;
        ((ains) this.k.b()).g("Bugle.Cms.IncrementalBackup.PwqDelay", this.j.f().toEpochMilli() - ((caxm) cayyVar.a()).f);
        return this.i.m.b().i(new eooz() { // from class: byjy
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                final bykd bykdVar = this.a;
                final cayy cayyVar2 = cayyVar;
                final byiv byivVar2 = byivVar;
                if (zBooleanValue) {
                    return bykdVar.f.l(new ejxr() { // from class: byjz
                        @Override // defpackage.ejxr
                        public final Object get() {
                            final byiv byivVar3 = byivVar2;
                            final int i3 = byivVar3.d;
                            final String str2 = byivVar3.e;
                            final int i4 = byivVar3.c;
                            final emcd emcdVarA = aukk.a(i3, byivVar3.f);
                            final cayy cayyVar3 = cayyVar2;
                            final int i5 = ((caxm) cayyVar3.a()).c + byivVar3.h;
                            final boolean z = byivVar3.g;
                            boolean zIsEmpty = TextUtils.isEmpty(str2);
                            final bykd bykdVar2 = bykdVar;
                            if (!zIsEmpty) {
                                cqbd cqbdVarA = bykd.a.a();
                                cqbdVarA.I("Processing");
                                cqbdVarA.y("tableType", i3);
                                cqbdVarA.A("itemId", str2);
                                cqbdVarA.y("flags", byivVar3.f);
                                cqbdVarA.A("queue", ((caxm) cayyVar3.a()).b);
                                cqbdVarA.y("accountId", i4);
                                cqbdVarA.A("workItemId", "pwq");
                                cqbdVarA.A("triggerName", byivVar3.j);
                                cqbdVarA.r();
                                return eiju.g(bykdVar2.g.b(eiid.c(new eooy() { // from class: byka
                                    @Override // defpackage.eooy
                                    public final ListenableFuture a() {
                                        final cayy cayyVar4 = cayyVar3;
                                        final int i6 = i4;
                                        final emcd emcdVar = emcdVarA;
                                        final boolean z2 = z;
                                        final bykd bykdVar3 = bykdVar2;
                                        final int i7 = i3;
                                        final String str3 = str2;
                                        eieu eieuVarK = eiiy.k("CmsBackupWorkHandler#launchBackupWork");
                                        final int i8 = i5;
                                        final byiv byivVar4 = byivVar3;
                                        try {
                                            eiju eijuVarE = bykdVar3.c.b(i6).i(new eooz() { // from class: bykb
                                                @Override // defpackage.eooz
                                                public final ListenableFuture a(Object obj2) {
                                                    byjm byjmVarBp = ((bykd.a) ehlh.a(bykdVar3.b, bykd.a.class, (efwo) obj2)).bp();
                                                    fcsu fcsuVar = byjmVarBp.a;
                                                    cazc cazcVarA = cayyVar4.a();
                                                    Map map = (Map) fcsuVar.b();
                                                    map.getClass();
                                                    aukz aukzVar = (aukz) byjmVarBp.b.b();
                                                    aukzVar.getClass();
                                                    cogw cogwVar = (cogw) byjmVarBp.c.b();
                                                    cogwVar.getClass();
                                                    byik byikVar = (byik) byjmVarBp.d.b();
                                                    byikVar.getClass();
                                                    bykf bykfVar = (bykf) byjmVarBp.e.b();
                                                    bykfVar.getClass();
                                                    cpup cpupVar = (cpup) byjmVarBp.f.b();
                                                    cpupVar.getClass();
                                                    ((bykk) byjmVarBp.g.b()).getClass();
                                                    cden cdenVar = (cden) byjmVarBp.h.b();
                                                    cdenVar.getClass();
                                                    fdjx fdjxVar = (fdjx) byjmVarBp.i.b();
                                                    fdjxVar.getClass();
                                                    apqc apqcVar = (apqc) byjmVarBp.j.b();
                                                    apqcVar.getClass();
                                                    ((apor) byjmVarBp.k.b()).getClass();
                                                    byiv byivVar5 = byivVar4;
                                                    byivVar5.getClass();
                                                    String str4 = str3;
                                                    str4.getClass();
                                                    byjl byjlVar = new byjl(map, aukzVar, cogwVar, byikVar, bykfVar, cpupVar, cdenVar, fdjxVar, apqcVar, byivVar5, cazcVarA, str4, i8);
                                                    return auvw.c(byjlVar.a, fcyi.a, fdjz.a, new byjj(byjlVar, null));
                                                }
                                            }, bykdVar3.d).e(axkg.class, new ejvr() { // from class: bykc
                                                public final /* synthetic */ String g = "pwq";

                                                @Override // defpackage.ejvr
                                                public final Object apply(Object obj2) {
                                                    axkg axkgVar = (axkg) obj2;
                                                    cqbd cqbdVarE = bykd.a.e();
                                                    cqbdVarE.I("Account not linked, skipping work item.");
                                                    cqbdVarE.y("tableType", i7);
                                                    cqbdVarE.A("itemId", str3);
                                                    byiv byivVar5 = byivVar4;
                                                    cqbdVarE.y("flags", byivVar5.f);
                                                    cqbdVarE.A("queue", ((caxm) cayyVar4.a()).b);
                                                    cqbdVarE.y("accountId", i6);
                                                    cqbdVarE.A("workItemId", this.g);
                                                    cqbdVarE.A("triggerName", byivVar5.j);
                                                    cqbdVarE.s(axkgVar);
                                                    bykd bykdVar4 = bykdVar3;
                                                    bykdVar4.e.j(emcdVar, z2, i8, axkgVar);
                                                    bykdVar4.k(byivVar5, 3);
                                                    return cbcw.k();
                                                }
                                            }, eoqg.a);
                                            eieuVarK.b(eijuVarE);
                                            eieuVarK.close();
                                            return eijuVarE;
                                        } finally {
                                        }
                                    }
                                }), bykdVar2.d));
                            }
                            cqbd cqbdVarE = bykd.a.e();
                            cqbdVarE.I("Missing itemId; work item will be failed permanently.");
                            cqbdVarE.y("tableType", i3);
                            cqbdVarE.y("flags", byivVar3.f);
                            cqbdVarE.A("queue", ((caxm) cayyVar3.a()).b);
                            cqbdVarE.y("accountId", i4);
                            cqbdVarE.A("workItemId", "pwq");
                            cqbdVarE.A("triggerName", byivVar3.j);
                            cqbdVarE.r();
                            bykdVar2.e.j(emcdVarA, z, i5, new byke());
                            bykdVar2.k(byivVar3, 3);
                            return eijx.e(cbcw.k());
                        }
                    });
                }
                int i3 = i2;
                String str2 = str;
                int i4 = i;
                cqbd cqbdVarE = bykd.a.e();
                cqbdVarE.I("Ignoring work, multidevice disabled on the device.");
                cqbdVarE.y("tableType", i4);
                cqbdVarE.A("itemId", str2);
                cqbdVarE.y("flags", byivVar2.f);
                cqbdVarE.A("queue", ((caxm) cayyVar2.a()).b);
                cqbdVarE.y("accountId", i3);
                cqbdVarE.A("triggerName", byivVar2.j);
                cqbdVarE.r();
                bykdVar.k(byivVar2, 4);
                return eijx.e(cbcw.i());
            }
        }, this.h);
    }

    public final void k(byiv byivVar, int i) {
        if ((byivVar.b & 64) != 0) {
            aukz aukzVar = this.e;
            emdn emdnVar = emdn.BACKUP_WORK;
            evvp evvpVar = byivVar.i;
            if (evvpVar == null) {
                evvpVar = evvp.a;
            }
            aukzVar.v(emdnVar, evvpVar, evxc.c(this.j.f().toEpochMilli()), i);
        }
    }
}
