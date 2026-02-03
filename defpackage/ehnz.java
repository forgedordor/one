package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehnz extends ContextWrapper implements ehnq {
    private static final ekrg a = ekrg.c("com/google/apps/tiktok/inject/peer/FragmentContextWrapper");
    private final ejxr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehnz(ea eaVar, Context context) {
        super(context);
        context.getClass();
        b(context, a(eaVar));
        this.b = ejxx.a(new ejxr() { // from class: ehny
            @Override // defpackage.ejxr
            public final Object get() {
                ehnz ehnzVar = this.a;
                return ((LayoutInflater) ehnzVar.getBaseContext().getSystemService("layout_inflater")).cloneInContext(ehnzVar);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Locale a(ea eaVar) {
        Locale localeBg;
        if ((eaVar instanceof ehnw) && (localeBg = ((ehnw) eaVar).bg()) != null) {
            return localeBg;
        }
        ea eaVar2 = eaVar.E;
        if (eaVar2 != null) {
            return a(eaVar2);
        }
        return null;
    }

    private static void b(Context context, Locale locale) {
        if (locale != null) {
            ((ekrd) ((ekrd) a.e()).h("com/google/apps/tiktok/inject/peer/FragmentContextWrapper", "maybeApplyCustomLocale", 46, "FragmentContextWrapper.java")).t("applying customLocale = %s", locale);
            Configuration configuration = new Configuration();
            configuration.locale = locale;
            Resources resources = context.getResources();
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return !"layout_inflater".equals(str) ? getBaseContext().getSystemService(str) : this.b.get();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ehnz(ea eaVar, final LayoutInflater layoutInflater) {
        Context context = layoutInflater.getContext();
        context.getClass();
        b(context, a(eaVar));
        super(context);
        this.b = ejxx.a(new ejxr() { // from class: ehnx
            @Override // defpackage.ejxr
            public final Object get() {
                return layoutInflater.cloneInContext(this.a);
            }
        });
    }
}
