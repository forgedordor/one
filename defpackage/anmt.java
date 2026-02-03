package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.Calendar;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anmt implements ancm {
    private final anmw a;
    private final crej b;
    private final fcsu c;

    public anmt(anmw anmwVar, crej crejVar, fcsu fcsuVar) {
        anmwVar.getClass();
        crejVar.getClass();
        this.a = anmwVar;
        this.b = crejVar;
        this.c = fcsuVar;
    }

    public static final Long f(brlo brloVar) {
        ezgi ezgiVarP = brloVar.p();
        ezbn ezbnVar = ezgiVarP.c == 19 ? (ezbn) ezgiVarP.d : ezbn.a;
        ezbnVar.getClass();
        ezpz ezpzVarA = eykd.a(ezbnVar);
        if (ezpzVarA == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.getClass();
        int i = 0;
        calendar.set(13, 0);
        calendar.set(14, 0);
        int i2 = ezpzVarA.b;
        boolean z = (i2 & 2) != 0;
        int i3 = i2 & 1;
        if (z) {
            if (i3 != 0) {
                eyaz eyazVar = ezpzVarA.c;
                if (eyazVar == null) {
                    eyazVar = eyaz.a;
                }
                eyazVar.getClass();
                g(calendar, eyazVar);
                eybm eybmVar = ezpzVarA.d;
                if (eybmVar == null) {
                    eybmVar = eybm.a;
                }
                eybmVar.getClass();
                h(calendar, eybmVar);
            }
            return Long.valueOf(calendar.getTimeInMillis());
        }
        i = i3;
        if (z) {
            eybm eybmVar2 = ezpzVarA.d;
            if (eybmVar2 == null) {
                eybmVar2 = eybm.a;
            }
            eybmVar2.getClass();
            h(calendar, eybmVar2);
        } else if (i != 0) {
            calendar.clear();
            eyaz eyazVar2 = ezpzVarA.c;
            if (eyazVar2 == null) {
                eyazVar2 = eyaz.a;
            }
            eyazVar2.getClass();
            g(calendar, eyazVar2);
        }
        return Long.valueOf(calendar.getTimeInMillis());
    }

    private static final void g(Calendar calendar, eyaz eyazVar) {
        calendar.set(eyazVar.b, eyazVar.c, eyazVar.d);
    }

    private static final void h(Calendar calendar, eybm eybmVar) {
        calendar.set(11, eybmVar.b);
        calendar.set(12, eybmVar.c);
    }

    @Override // defpackage.ancm
    public final brdr a(brdr brdrVar) {
        brna brnaVarA = brnk.a();
        brnaVarA.A("LoadSuggestionShortcutExtension#extendQuery");
        brnaVarA.c(new Function() { // from class: anmn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brmj brmjVar = (brmj) obj;
                fcww fcwwVar = new fcww((byte[]) null);
                fcwwVar.add(brmjVar.a);
                fcwwVar.add(brmjVar.e);
                fcwwVar.add(brmjVar.d);
                fcwwVar.add(brmjVar.g);
                brmk[] brmkVarArr = (brmk[]) fcva.a(fcwwVar).toArray(new brmk[0]);
                return (brmk[]) Arrays.copyOf(brmkVarArr, brmkVarArr.length);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brmz brmzVarB = brnaVarA.b();
        brmk brmkVar = brnk.c.b;
        brao braoVar = MessagesTable.c.a;
        brnj brnjVar = new brnj();
        fcxk fcxkVar = new fcxk();
        crej crejVar = this.b;
        if (crejVar.d()) {
            fcxkVar.add(ezan.CALENDAR);
        }
        if (crejVar.e()) {
            fcxkVar.add(ezan.DUO_CALL);
        }
        if (crejVar.k()) {
            fcxkVar.add(ezan.STARRING);
        }
        brnjVar.f(fcwm.a(fcxkVar));
        brdrVar.H(brmzVarB.t(brmkVar, braoVar, new brnd(brnjVar)).g());
        return brdrVar;
    }

    @Override // defpackage.ancm
    public final boolean c() {
        Object objE = ((cczi) crbf.bE.get()).e();
        objE.getClass();
        return ((Boolean) objE).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
    @Override // defpackage.ancm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.anck r5, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable.BindData r6, defpackage.andw r7, defpackage.ekgp r8, defpackage.ajts r9, defpackage.anbi r10) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anmt.d(anck, com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable$BindData, andw, ekgp, ajts, anbi):void");
    }

    @Override // defpackage.ancm
    public final anbf e() {
        return this.a;
    }

    @Override // defpackage.ancm
    public final /* synthetic */ bsje b(bsje bsjeVar) {
        return bsjeVar;
    }
}
