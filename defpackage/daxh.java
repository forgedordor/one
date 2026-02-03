package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daxh {
    public static final String a(fcsu fcsuVar) {
        String strA = ((dawe) fcsuVar.b()).a();
        if (strA != null) {
            return strA;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final acca b(final Activity activity, final fcsu fcsuVar, final fcsu fcsuVar2, final fcsu fcsuVar3, boolean z) {
        dyun dyunVarK = dyuo.k();
        ((dyug) dyunVarK).b = ejud.a;
        dyunVarK.c(new dyuw());
        if (z) {
            dyunVarK.d(new dyuy(activity.getString(R.string.app_name)));
        }
        acas acasVar = new acas();
        acasVar.a = dyunVarK.e();
        acasVar.d(new accc() { // from class: daxe
            @Override // defpackage.accc
            public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return layoutInflater.inflate(R.layout.welcome_express_sign_in, viewGroup, false);
            }

            @Override // defpackage.accc
            public final /* synthetic */ void b() {
            }
        });
        acasVar.c(new Function() { // from class: daxf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                efwo efwoVar = (efwo) obj;
                dauc daucVar = (dauc) fcsuVar.b();
                efwoVar.getClass();
                String strA = daxh.a(fcsuVar2);
                Intent intent = activity.getIntent();
                intent.getClass();
                daucVar.a(efwoVar, strA, daug.a(intent), (chnc) ((daxj) fcsuVar3.b()).b.c());
                return null;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        acasVar.b(new Function() { // from class: daxg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                efwo efwoVar = (efwo) obj;
                dauc daucVar = (dauc) fcsuVar.b();
                efwoVar.getClass();
                Activity activity2 = activity;
                String strA = daxh.a(fcsuVar2);
                Intent intent = activity2.getIntent();
                intent.getClass();
                daucVar.b(efwoVar, strA, daug.a(intent));
                return null;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return acasVar.a();
    }
}
