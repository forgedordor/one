package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class weq implements dpmi {
    private static final ekrg d = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/ProjectionSpecComposeScreenClearcutLogger");
    public final cogw a;
    public Instant b;
    public int c;
    private final emsp e;
    private final fdap f;
    private final fctc g;
    private final wre h;

    public weq(final fcsu fcsuVar, cogw cogwVar, wre wreVar, emsp emspVar, fdap fdapVar) {
        fcsuVar.getClass();
        cogwVar.getClass();
        wreVar.getClass();
        emspVar.getClass();
        this.a = cogwVar;
        this.h = wreVar;
        this.e = emspVar;
        this.f = fdapVar;
        this.g = fctd.a(new fdae() { // from class: wep
            @Override // defpackage.fdae
            public final Object invoke() {
                return (aisc) fcsuVar.b();
            }
        });
    }

    public final int a() {
        List<vvs> list = ((vvw) this.h.a.c()).b;
        int i = 0;
        if (list.isEmpty()) {
            return 0;
        }
        for (vvs vvsVar : list) {
            if ((vvsVar instanceof vvr) && ((Boolean) this.f.invoke(((vvr) vvsVar).a)).booleanValue() && (i = i + 1) < 0) {
                fcva.l();
            }
        }
        return i;
    }

    @Override // defpackage.dpmi
    public final void e() {
        aisc aiscVar = (aisc) this.g.a();
        emsr emsrVar = emsr.FULL_SCREEN;
        emsh emshVar = emsh.UNKNOWN_CLOSING_SOURCE;
        Integer numValueOf = Integer.valueOf(a() - this.c);
        Instant instant = null;
        Duration durationA = null;
        if (this.b == null) {
            ekrw ekrwVarI = d.i();
            ekrwVarI.X(eksq.a, "BugleComposeRow2");
            ekrd ekrdVar = (ekrd) ekrwVarI;
            ekrdVar.Z(eksk.MEDIUM);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/directsend/ProjectionSpecComposeScreenClearcutLogger", "resolveTimeSpent", 73, "ProjectionSpecComposeScreenClearcutLogger.kt")).q("Did not record an opening time");
        } else {
            Instant instantF = this.a.f();
            instantF.getClass();
            Instant instant2 = this.b;
            if (instant2 == null) {
                fdbq.c("openingTime");
            } else {
                instant = instant2;
            }
            durationA = eooc.a(instantF, instant);
        }
        aiscVar.c(this.e, emsrVar, emshVar, numValueOf, durationA);
    }

    @Override // defpackage.dpmi
    public final void f() {
        throw null;
    }
}
