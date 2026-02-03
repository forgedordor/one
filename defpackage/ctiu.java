package defpackage;

import com.google.android.apps.messaging.startchat.viewmodel.StartChatViewModel;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctiu {
    public final eygg a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fctc j;
    public final fctc k;
    private final fcsu l;
    private final fctc m;

    public ctiu(eygg eyggVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9) {
        eyggVar.getClass();
        fcsuVar8.getClass();
        this.a = eyggVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = fcsuVar4;
        this.l = fcsuVar5;
        this.f = fcsuVar6;
        this.g = fcsuVar7;
        this.h = fcsuVar8;
        this.i = fcsuVar9;
        Object objB = fcsuVar.b();
        objB.getClass();
        ea eaVar = (ea) objB;
        fctc fctcVarB = fctd.b(3, new ctiq(new ctip(eaVar)));
        int i = fdcj.a;
        this.m = new lxf(new fdbi(StartChatViewModel.class), new ctir(fctcVarB), new ctit(eaVar, fctcVarB), new ctis(fctcVarB));
        this.j = fctd.a(new fdae() { // from class: ctii
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.fdae
            public final Object invoke() {
                eg egVarFg = ((ctig) this.a.b.b()).fg();
                boolean z = false;
                if (!egVarFg.isDestroyed()) {
                    ehlg ehlgVar = egVarFg instanceof ehlg ? (ehlg) egVarFg : null;
                    if ((ehlgVar != null ? ehlgVar.H() : null) instanceof afjs) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }
        });
        this.k = fctd.a(new fdae() { // from class: ctij
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.fdae
            public final Object invoke() {
                eg egVarFg = ((ctig) this.a.b.b()).fg();
                boolean z = false;
                if (!egVarFg.isDestroyed()) {
                    ehlg ehlgVar = egVarFg instanceof ehlg ? (ehlg) egVarFg : null;
                    if ((ehlgVar != null ? ehlgVar.H() : null) instanceof ahbh) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            }
        });
    }

    public final StartChatViewModel a() {
        return (StartChatViewModel) this.m.a();
    }

    public final boolean b() {
        fcsu fcsuVar = this.i;
        return ((Optional) fcsuVar.b()).isPresent() ? ((aidn) ((Optional) fcsuVar.b()).get()).a() == aidm.b : afic.a(((ctig) this.b.b()).fg(), ((tlt) this.l.b()).a);
    }
}
