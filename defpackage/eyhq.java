package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eyhq implements eyhx {
    private volatile Object a;
    private final Object b = new Object();
    private final boolean c;
    private final View d;

    /* compiled from: PG */
    public interface b {
        ahnp aK();
    }

    /* compiled from: PG */
    public interface c {
        ahop J();
    }

    public eyhq(View view, boolean z) {
        this.d = view;
        this.c = z;
    }

    private final Context b(Class cls, boolean z) {
        View view = this.d;
        Context context = view.getContext();
        while ((context instanceof ContextWrapper) && !cls.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context != eygs.a(context.getApplicationContext())) {
            return context;
        }
        eyhz.a(z, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", view.getClass());
        return null;
    }

    private final eyhx c(boolean z) {
        if (this.c) {
            Context contextB = b(a.class, z);
            if (contextB instanceof a) {
                eyhz.a(contextB.getClass().equals(a.class), "%s, Only account views can attach to account fragments.", this.d.getClass());
                return (eyhx) ((a) contextB).a();
            }
            if (z) {
                return null;
            }
            eyhz.a(!(r6 instanceof eyhx), "%s, @WithFragmentBindings Hilt view must be attached to an @AndroidEntryPoint Fragment. Was attached to context %s", this.d.getClass(), b(eyhx.class, false).getClass().getName());
        } else {
            Object objB = b(eyhx.class, z);
            if (objB instanceof eyhx) {
                return (eyhx) objB;
            }
            if (z) {
                return null;
            }
        }
        throw new IllegalStateException(String.format("%s, Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.", this.d.getClass()));
    }

    public final eyhx a() {
        return c(true);
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        Object ahnrVar;
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    eyhx eyhxVarC = c(false);
                    if (this.c) {
                        ahop ahopVarJ = ((c) eygm.a(eyhxVarC, c.class)).J();
                        ahopVarJ.a = this.d;
                        ahnrVar = ahopVarJ.a();
                    } else {
                        ahnp ahnpVarAK = ((b) eygm.a(eyhxVarC, b.class)).aK();
                        ahnpVarAK.d = this.d;
                        eyij.a(ahnpVarAK.d, View.class);
                        ahnrVar = new ahnr(ahnpVarAK.a, ahnpVarAK.b, ahnpVarAK.c);
                    }
                    this.a = ahnrVar;
                }
            }
        }
        return this.a;
    }

    /* compiled from: PG */
    public class a extends ContextWrapper {
        public ea a;
        public LayoutInflater b;
        public LayoutInflater c;
        private final lvh d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, ea eaVar) {
            super(context);
            eyhz.b(context);
            eyhp eyhpVar = new eyhp(this);
            this.d = eyhpVar;
            this.b = null;
            this.a = eaVar;
            eaVar.P().c(eyhpVar);
        }

        public final ea a() {
            eyhz.c(this.a, "The fragment has already been destroyed.");
            return this.a;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final Object getSystemService(String str) {
            if (!"layout_inflater".equals(str)) {
                return getBaseContext().getSystemService(str);
            }
            if (this.c == null) {
                if (this.b == null) {
                    this.b = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
                }
                this.c = this.b.cloneInContext(this);
            }
            return this.c;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(LayoutInflater layoutInflater, ea eaVar) {
            eyhz.b(layoutInflater);
            Context context = layoutInflater.getContext();
            eyhz.b(context);
            super(context);
            eyhp eyhpVar = new eyhp(this);
            this.d = eyhpVar;
            this.b = layoutInflater;
            this.a = eaVar;
            eaVar.P().c(eyhpVar);
        }
    }
}
