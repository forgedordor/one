package defpackage;

import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anmw implements anbf {
    private final brmz a;
    private final ancj b;

    public anmw(final dqsn dqsnVar, anch anchVar) {
        dqsnVar.getClass();
        anchVar.getClass();
        brna brnaVarA = brnk.a();
        brnaVarA.A("SuggestionShortcutChangeObserver");
        brmz brmzVarB = brnaVarA.b();
        this.a = brmzVarB;
        this.b = anchVar.a("SuggestionShortcutChangeObserver", brmzVarB, new anci() { // from class: anmu
            @Override // defpackage.anci
            public final Object a(final Consumer consumer) {
                return new annh(dqsnVar, new fdap() { // from class: anmv
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ekgb ekgbVar = (ekgb) obj;
                        ekgbVar.getClass();
                        consumer.z(ekgbVar);
                        return fctx.a;
                    }
                });
            }
        });
    }

    @Override // defpackage.anbf
    public final anbe a() {
        return this.b.a();
    }

    @Override // defpackage.anbf
    public final cquc b(ajmg ajmgVar) {
        return this.b.b(ajmgVar);
    }
}
