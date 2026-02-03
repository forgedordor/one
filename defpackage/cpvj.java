package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpvj implements cpuw {
    public static final cqce a = cqce.g("BugleCms", "CmsRestoreManagerImpl");
    public final axky b;
    public final aurx c;
    public final ucb d;
    public final cprd e;
    public final cpmd f;
    public final cpvr g;
    public final cgbn h;
    public final eosc i;
    public final aukz j;
    public final eosc k;
    public final cpzo l;
    public final fcsu m;
    public final fcsu n;
    public final autx o;
    public final fcsu p;
    public final aoot q;
    public final cobl r;
    public final byeq s;
    private final cogw t;
    private final fcsu u;
    private final fcsu v;
    private final fcsu w;
    private final awlc x;

    /* compiled from: PG */
    public interface a {
        cpnx fw();
    }

    public cpvj(axky axkyVar, aurx aurxVar, byeq byeqVar, ucb ucbVar, cprd cprdVar, cpmd cpmdVar, aukz aukzVar, cpvr cpvrVar, cgbn cgbnVar, cogw cogwVar, cpzo cpzoVar, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, autx autxVar, fcsu fcsuVar6, aoot aootVar, cobl coblVar, awlc awlcVar) {
        this.b = axkyVar;
        this.c = aurxVar;
        this.s = byeqVar;
        this.d = ucbVar;
        this.e = cprdVar;
        this.f = cpmdVar;
        this.j = aukzVar;
        this.g = cpvrVar;
        this.h = cgbnVar;
        this.t = cogwVar;
        this.l = cpzoVar;
        this.i = eoscVar;
        this.k = eoscVar2;
        this.m = fcsuVar;
        this.n = fcsuVar2;
        this.u = fcsuVar3;
        this.v = fcsuVar4;
        this.w = fcsuVar5;
        this.o = autxVar;
        this.p = fcsuVar6;
        this.q = aootVar;
        this.r = coblVar;
        this.x = awlcVar;
    }

    @Override // defpackage.cpuw
    public final cazi a(efwo efwoVar, cpyb cpybVar) {
        if (((Boolean) this.w.b()).booleanValue()) {
            ((ajfo) this.v.b()).d(ajfo.F);
        }
        this.x.d(new Consumer() { // from class: cpvg
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((caiq) obj).h();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        try {
            final canf canfVar = (canf) cang.b.createBuilder();
            int iA = efwoVar.a();
            canfVar.copyOnWrite();
            cang cangVar = (cang) canfVar.instance;
            cangVar.c |= 1;
            cangVar.d = iA;
            cank cankVar = cank.BACKUP_KEY;
            canfVar.copyOnWrite();
            cang cangVar2 = (cang) canfVar.instance;
            cangVar2.e = cankVar.g;
            cangVar2.c |= 2;
            canfVar.copyOnWrite();
            cang cangVar3 = (cang) canfVar.instance;
            cangVar3.c |= 8;
            cangVar3.g = false;
            int i = cpybVar.d;
            canfVar.copyOnWrite();
            cang cangVar4 = (cang) canfVar.instance;
            cangVar4.c |= 16;
            cangVar4.h = i;
            cogw cogwVar = this.t;
            evvp evvpVarC = evxc.c(cogwVar.f().toEpochMilli());
            canfVar.copyOnWrite();
            cang cangVar5 = (cang) canfVar.instance;
            evvpVarC.getClass();
            cangVar5.i = evvpVarC;
            cangVar5.c |= 32;
            evvp evvpVarC2 = evxc.c(cogwVar.f().toEpochMilli());
            canfVar.copyOnWrite();
            cang cangVar6 = (cang) canfVar.instance;
            evvpVarC2.getClass();
            cangVar6.j = evvpVarC2;
            cangVar6.c |= 64;
            canfVar.a(cank.ENCRYPTION_KEYS);
            canfVar.a(cank.PARTICIPANTS);
            canfVar.a(cank.CONVERSATIONS);
            canfVar.a(cank.MESSAGES);
            if (cpybVar != cpyb.BACKUP_AND_RESTORE) {
                return (cazi) this.s.a.c("CmsRestoreManagerImpl#enqueueRestoreWorkUsingPwq", new ejxr() { // from class: cpvh
                    @Override // defpackage.ejxr
                    public final Object get() {
                        cpvj cpvjVar = this.a;
                        cpvjVar.r.h();
                        boolean zBooleanValue = ((Boolean) ((cczi) cpyl.M.get()).e()).booleanValue();
                        canf canfVar2 = canfVar;
                        if (!zBooleanValue) {
                            return ((cazj) ((calx) cpvjVar.m.b()).a.b()).a(cbcu.f("cms_restore_page", (cang) canfVar2.build()));
                        }
                        canfVar2.copyOnWrite();
                        cang cangVar7 = (cang) canfVar2.instance;
                        evsy evsyVar = cang.a;
                        cangVar7.c |= 128;
                        cangVar7.l = true;
                        return ((cazj) ((calv) cpvjVar.n.b()).a.b()).a(cbcu.f("cms_restore_page_foreground", (cang) canfVar2.build()));
                    }
                });
            }
            return ((cazj) ((cacg) this.u.b()).a.b()).a(cbcu.f("disable_multi_device_on_server_when_enable_bnr", (cang) canfVar.build()));
        } catch (RuntimeException e) {
            this.x.d(new Consumer() { // from class: cpvi
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ((caiq) obj).s();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            throw e;
        }
    }

    public final void b() {
        this.c.an();
    }
}
