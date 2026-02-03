package defpackage;

import android.content.Context;
import android.os.Looper;
import android.widget.Toast;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dain {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/ui/toastpresenter/ToastPresenter");
    private final Context b;
    private final fcsu c;

    public dain(Context context, fcsu fcsuVar) {
        context.getClass();
        fcsuVar.getClass();
        this.b = context;
        this.c = fcsuVar;
    }

    public final Toast a(CharSequence charSequence, boolean z) {
        charSequence.getClass();
        ekrg ekrgVar = a;
        ((ekrd) ekrgVar.h().h("com/google/android/apps/messaging/ui/toastpresenter/ToastPresenter", "showToastAtBottom", 34, "ToastPresenter.kt")).t("Showing toast with message: %s", z ? cqcv.b(charSequence) : charSequence);
        final Toast toastMakeText = Toast.makeText(this.b, charSequence, 1);
        toastMakeText.setGravity(81, 0, 0);
        toastMakeText.getClass();
        Optional optional = (Optional) this.c.b();
        final fdap fdapVar = new fdap() { // from class: dail
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((aidh) obj).c());
            }
        };
        Object objOrElse = optional.map(new Function() { // from class: daim
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return fdapVar.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false);
        objOrElse.getClass();
        if (((Boolean) objOrElse).booleanValue()) {
            ((ekrd) ekrgVar.h().h("com/google/android/apps/messaging/ui/toastpresenter/ToastPresenter", "showToastInternal", 45, "ToastPresenter.kt")).q("Suppressing toast for Retail Mode device");
            return toastMakeText;
        }
        Runnable runnable = new Runnable() { // from class: daik
            @Override // java.lang.Runnable
            public final void run() {
                toastMakeText.show();
            }
        };
        if (fdbq.f(Looper.myLooper(), Looper.getMainLooper())) {
            runnable.run();
            return toastMakeText;
        }
        ecem.e(runnable);
        return toastMakeText;
    }

    public final void c(int i, boolean z) {
        String string = this.b.getString(i);
        string.getClass();
        a(string, z);
    }
}
