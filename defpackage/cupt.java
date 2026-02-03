package defpackage;

import android.os.Bundle;
import androidx.preference.Preference;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cupt extends cuqd {
    public Optional aj;
    public fcsu ak;
    public Optional al;

    @Override // defpackage.aiif
    protected final boolean bj() {
        return false;
    }

    @Override // defpackage.aiif, defpackage.ozm
    public final void gh(Bundle bundle, String str) {
        super.gh(bundle, str);
        this.aj.ifPresent(new Consumer() { // from class: cupq
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((craw) ((eygg) obj).b()).a();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.b.f("bugle");
        f(R.xml.federated_learning_preferences);
        e().ag();
        if (this.aj.isPresent()) {
            Preference preferenceL = e().l(Y(R.string.p2p_conversation_suggestions_training_enabled_pref_key));
            if (preferenceL == null) {
                cqaz.c("Federated learning preference was null.");
            } else {
                preferenceL.Z();
                preferenceL.n = new oza() { // from class: cupr
                    @Override // defpackage.oza
                    public final boolean a(Preference preference, Object obj) {
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        cupt cuptVar = this.a;
                        ((craw) ((eygg) cuptVar.aj.get()).b()).f(zBooleanValue);
                        if (zBooleanValue) {
                            ((aise) cuptVar.ak.b()).e(3, 3);
                            return true;
                        }
                        ((aise) cuptVar.ak.b()).f(3);
                        cuptVar.al.ifPresent(new Consumer() { // from class: cups
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj2) {
                                ((cdek) obj2).b();
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        return true;
                    }
                };
            }
        }
    }
}
