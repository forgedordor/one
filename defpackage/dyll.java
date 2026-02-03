package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.libraries.onegoogle.accountmenu.features.education.db.EducationDatabase;
import j$.time.Instant;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyll extends dyiw {
    public final ekgp b;
    public final ekhx c;
    public final EducationDatabase d;
    public final dylq e;
    public final Executor f;
    public final dykx g;
    private final Resources h;

    /* JADX WARN: Multi-variable type inference failed */
    public dyll(Context context, final EducationDatabase educationDatabase, Executor executor, dykx dykxVar, ekgb ekgbVar) {
        int i;
        this.d = educationDatabase;
        this.e = educationDatabase.y();
        this.f = executor;
        this.g = dykxVar;
        final ekfw ekfwVar = new ekfw();
        final ekfw ekfwVar2 = new ekfw();
        ekgi ekgiVar = new ekgi();
        ekhv ekhvVar = new ekhv();
        this.h = context.getResources();
        int i2 = ((ekoe) ekgbVar).c;
        int i3 = 0;
        while (i3 < i2) {
            dykv dykvVar = (dykv) ekgbVar.get(i3);
            String strA = exbr.a(dykvVar.d());
            ekgiVar.i(strA, dykvVar);
            ekhvVar.j(dykvVar.a());
            ekfwVar.h(new dylo(strA));
            ekqg ekqgVarListIterator = dykvVar.a().listIterator();
            while (true) {
                i = i3 + 1;
                if (ekqgVarListIterator.hasNext()) {
                    ekfwVar2.h(new dylp(strA, this.h.getResourceName(((Integer) ekqgVarListIterator.next()).intValue())));
                }
            }
            i3 = i;
        }
        this.b = ekgiVar.c();
        this.c = ekhvVar.g();
        executor.execute(new Runnable() { // from class: dylb
            @Override // java.lang.Runnable
            public final void run() {
                final dyll dyllVar = this.a;
                final ekfw ekfwVar3 = ekfwVar;
                final ekfw ekfwVar4 = ekfwVar2;
                educationDatabase.p(new Runnable() { // from class: dylh
                    @Override // java.lang.Runnable
                    public final void run() {
                        dylq dylqVar = dyllVar.e;
                        final ekgb ekgbVarG = ekfwVar3.g();
                        final dymd dymdVar = (dymd) dylqVar;
                        fdap fdapVar = new fdap() { // from class: dylr
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj) throws Exception {
                                dymdVar.c.c((pgz) obj, ekgbVarG);
                                return null;
                            }
                        };
                        pex pexVar = dymdVar.a;
                        phx.b(pexVar, false, true, fdapVar);
                        final ekgb ekgbVarG2 = ekfwVar4.g();
                        phx.b(pexVar, false, true, new fdap() { // from class: dylx
                            @Override // defpackage.fdap
                            public final Object invoke(Object obj) throws Exception {
                                dymdVar.b.c((pgz) obj, ekgbVarG2);
                                return null;
                            }
                        });
                    }
                });
            }
        });
    }

    public final void a(dylo dyloVar) {
        if (dyloVar.e == 0) {
            dyloVar.e = Instant.now().toEpochMilli();
        }
        this.d.y().a(dyloVar);
    }

    public final void b(final lvj lvjVar, final fr frVar, final dzdh dzdhVar) {
        final dylk dylkVar = new dylk(this.f, this.d);
        ejwl.m(dzdg.a(dzdhVar), "Anchor is not visible on screen.");
        dylkVar.f(lvjVar, new lvz() { // from class: dyld
            @Override // defpackage.lvz
            public final void a(Object obj) {
                final List list = (List) obj;
                dylkVar.l(lvjVar);
                if (list == null || list.isEmpty()) {
                    return;
                }
                dzdh dzdhVar2 = dzdhVar;
                ekgb ekgbVarS = ekgb.s(dxza.RED_ALERT, dxza.YELLOW_ALERT);
                AccountParticleDisc accountParticleDisc = ((SelectedAccountDisc) dzdhVar2).c;
                if (ekgbVarS.contains(accountParticleDisc.c())) {
                    return;
                }
                final dyll dyllVar = this.a;
                final dylo dyloVar = ((dyme) list.get(0)).a;
                final dykv dykvVar = (dykv) dyllVar.b.get(dyloVar.a);
                if (dykvVar == null) {
                    dyllVar.f.execute(new Runnable() { // from class: dyle
                        @Override // java.lang.Runnable
                        public final void run() {
                            final dymd dymdVar = (dymd) dyllVar.d.y();
                            pex pexVar = dymdVar.a;
                            final dylo dyloVar2 = dyloVar;
                            phx.b(pexVar, false, true, new fdap() { // from class: dylv
                                @Override // defpackage.fdap
                                public final Object invoke(Object obj2) throws Exception {
                                    dymdVar.d.c((pgz) obj2, dyloVar2);
                                    return null;
                                }
                            });
                        }
                    });
                    return;
                }
                if (dyloVar.c == 0 && dykvVar.c(frVar, dzdhVar2, new Runnable() { // from class: dylf
                    @Override // java.lang.Runnable
                    public final void run() {
                        final dyll dyllVar2 = dyllVar;
                        final dykv dykvVar2 = dykvVar;
                        final dylo dyloVar2 = dyloVar;
                        dyllVar2.f.execute(new Runnable() { // from class: dylc
                            @Override // java.lang.Runnable
                            public final void run() {
                                dyll dyllVar3 = dyllVar2;
                                dylo dyloVar3 = dyloVar2;
                                dyllVar3.a(dyloVar3);
                                dyloVar3.f = Instant.now().toEpochMilli();
                                if (dykvVar2.b()) {
                                    dyloVar3.c = 1;
                                    if (dyllVar3.c.isEmpty()) {
                                        dyloVar3.h = true;
                                    }
                                }
                                dyllVar3.d.y().a(dyloVar3);
                            }
                        });
                        dyllVar2.g.a();
                    }
                })) {
                    dyllVar.f.execute(new Runnable() { // from class: dylg
                        @Override // java.lang.Runnable
                        public final void run() {
                            dyll dyllVar2 = dyllVar;
                            dyllVar2.a(dyloVar);
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                final dylp dylpVar = ((dyme) it.next()).b;
                                if (dylpVar != null && dylpVar.e) {
                                    dylpVar.e = false;
                                    final dymd dymdVar = (dymd) dyllVar2.e;
                                    phx.b(dymdVar.a, false, true, new fdap() { // from class: dylu
                                        @Override // defpackage.fdap
                                        public final Object invoke(Object obj2) throws Exception {
                                            dymdVar.e.c((pgz) obj2, dylpVar);
                                            return null;
                                        }
                                    });
                                }
                            }
                        }
                    });
                    int iD = dykvVar.d();
                    evsl evslVar = dyxw.b;
                    dyxx dyxxVar = (dyxx) dyxy.a.createBuilder();
                    emmf emmfVar = (emmf) emmg.a.createBuilder();
                    emmd emmdVar = (emmd) emme.a.createBuilder();
                    emmdVar.copyOnWrite();
                    emme emmeVar = (emme) emmdVar.instance;
                    emmeVar.c = iD - 1;
                    emmeVar.b |= 2;
                    emmfVar.copyOnWrite();
                    emmg emmgVar = (emmg) emmfVar.instance;
                    emme emmeVar2 = (emme) emmdVar.build();
                    emmeVar2.getClass();
                    emmgVar.d = emmeVar2;
                    emmgVar.c |= 1;
                    dyxxVar.copyOnWrite();
                    dyxy dyxyVar = (dyxy) dyxxVar.instance;
                    emmg emmgVar2 = (emmg) emmfVar.build();
                    emmgVar2.getClass();
                    dyxyVar.c = emmgVar2;
                    dyxyVar.b |= 1;
                    dyyg.b(accountParticleDisc, new dsvf(evslVar, (dyxy) dyxxVar.build()));
                }
            }
        });
    }
}
