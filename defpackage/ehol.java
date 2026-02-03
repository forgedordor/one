package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import defpackage.eyhq;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehol implements eyhx {
    private volatile Object a;
    private final Object b = new Object();
    private final View c;

    /* compiled from: PG */
    public final class a extends eyhq.a {
        public a(Context context, ea eaVar) {
            super(context, eaVar);
        }

        public a(LayoutInflater layoutInflater, ea eaVar) {
            super(layoutInflater, eaVar);
        }
    }

    /* compiled from: PG */
    public interface b {
        ahnk H();
    }

    /* compiled from: PG */
    public interface c {
        ahop J();
    }

    public ehol(View view) {
        this.c = view;
    }

    private final Context a(Class cls) {
        View view = this.c;
        Context contextB = b(view.getContext(), cls);
        ejwl.p(contextB != b(contextB.getApplicationContext(), eyhx.class), "%s, Sting view cannot be created using the application context. Use a Sting Fragment or Activity context.", view.getClass());
        return contextB;
    }

    private static Context b(Context context, Class cls) {
        while ((context instanceof ContextWrapper) && !cls.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        Object objA;
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    Context contextA = a(eyhq.a.class);
                    if (contextA instanceof a) {
                        ahnk ahnkVarH = ((b) ((eyhx) ((eyhq.a) contextA).a()).bb()).H();
                        ahnkVarH.e = this.c;
                        eyij.a(ahnkVarH.e, View.class);
                        View view = ahnkVarH.e;
                        objA = new ahno(ahnkVarH.a, ahnkVarH.b, ahnkVarH.c, ahnkVarH.d, view);
                    } else {
                        if (!(contextA instanceof eyhq.a)) {
                            Context contextA2 = a(eyhx.class);
                            View view2 = this.c;
                            ejwl.r(!(contextA2 instanceof eyhx), "%s, @WithFragmentBindings Sting view must be attached to an @Sting Fragment. Was attached to context: %s", view2.getClass(), contextA2.getClass().getName());
                            throw new IllegalStateException(String.format("%s, Sting view must be attached to an @Sting Fragment or Activity. Was attached to context: %s", view2.getClass(), contextA2.getClass().getName()));
                        }
                        View view3 = this.c;
                        ejwl.p(true, "%s, Account views may only attach to account fragments.", view3.getClass());
                        ahop ahopVarJ = ((c) ((eyhx) ((eyhq.a) contextA).a()).bb()).J();
                        ahopVarJ.a = view3;
                        objA = ahopVarJ.a();
                    }
                    this.a = objA;
                }
            }
        }
        return this.a;
    }
}
