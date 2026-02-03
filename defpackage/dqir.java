package defpackage;

import android.app.Activity;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqir {
    public static final ekrg a = ekrg.c("com/google/android/libraries/compose/voice/ui/screen/VoiceUiAdapter");
    public final dqbh b;
    public final Activity c;
    public final fduf d;
    public boolean e;
    public final fduf f;
    public final fdvc g;
    public final dqik h;
    private final Optional i;

    public dqir(dqbh dqbhVar, Activity activity, Optional optional) {
        activity.getClass();
        this.b = dqbhVar;
        this.c = activity;
        this.i = optional;
        this.d = fdvf.a(null);
        dqbv dqbvVar = (dqbv) dqbw.a.createBuilder();
        dqbvVar.getClass();
        fduf fdufVarA = fdvf.a(dqbx.a(dqbvVar));
        this.f = fdufVarA;
        this.g = new fduh(fdufVarA);
        this.h = new dqik(this);
    }

    public final fdpl a(dqgm dqgmVar) {
        dqgj dqgjVar = null;
        dqiq dqiqVar = new dqiq(this, null);
        dqbn dqbnVar = (dqbn) this.b;
        List listG = fcva.g(new fdtm(dqgmVar.a, dqiqVar), dqgmVar.d, dqgmVar.g, this.d, dqbnVar.g, dqbnVar.e, this.g);
        Optional optional = dqgmVar.j;
        if (optional.isPresent()) {
            Object obj = optional.get();
            dlzf dlzfVar = (dlzf) obj;
            dlzfVar.a.f(true);
            dqgjVar = new dqgj(dlzfVar.b, new dqip(obj));
        }
        return new dqin((fdpl[]) fcva.ao(listG).toArray(new fdpl[0]), this, dqgmVar, dqgjVar);
    }

    public final void b() {
        c(dqgn.b);
    }

    public final void c(final dqgo dqgoVar) {
        final fdap fdapVar = new fdap() { // from class: dqih
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((dqie) obj).getClass();
                dqir dqirVar = this;
                int iOrdinal = dqgoVar.ordinal();
                if (iOrdinal == 0) {
                    dqirVar.c.getWindow().clearFlags(128);
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        throw new fctg();
                    }
                    dqirVar.c.getWindow().clearFlags(128);
                } else {
                    dqirVar.c.getWindow().addFlags(128);
                }
                return fctx.a;
            }
        };
        this.i.ifPresent(new Consumer() { // from class: dqii
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                fdapVar.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
