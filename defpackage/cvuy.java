package defpackage;

import android.R;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvuy implements efzm {
    final /* synthetic */ cvuz a;

    public cvuy(cvuz cvuzVar) {
        this.a = cvuzVar;
    }

    @Override // defpackage.efzm
    public final void a(efzk efzkVar) {
        final efwo efwoVarA = efzkVar.a();
        efwoVarA.getClass();
        final cvuz cvuzVar = this.a;
        Optional optional = (Optional) cvuzVar.b.b();
        final fdap fdapVar = new fdap() { // from class: cvuu
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((cvut) obj).getClass();
                cvve cvveVar = new cvve();
                eyhj.e(cvveVar);
                ehok.b(cvveVar, efwoVarA);
                cg cgVar = new cg(cvuzVar.a.a());
                cgVar.x(R.id.content, cvveVar, "ConversationDetailsFragment");
                cgVar.c();
                return fctx.a;
            }
        };
        optional.ifPresent(new Consumer() { // from class: cvuv
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

    @Override // defpackage.efzm
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.efzm
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.efzm
    public final void c(efyg efygVar) {
    }
}
