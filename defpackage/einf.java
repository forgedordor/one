package defpackage;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewParent;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class einf {
    public static void a(Activity activity, Class cls, eind eindVar) {
        View viewFindViewById = activity.findViewById(R.id.content);
        viewFindViewById.getClass();
        k(com.google.android.apps.messaging.R.id.tiktok_event_activity_listeners, viewFindViewById, cls, eindVar);
    }

    public static void b(dn dnVar, Class cls, eind eindVar) {
        View viewA = eina.a(dnVar);
        viewA.getClass();
        k(com.google.android.apps.messaging.R.id.tiktok_event_fragment_listeners, viewA, cls, eindVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(ea eaVar, Class cls, eind eindVar) {
        View view = eaVar.Q;
        if (view != null) {
            k(com.google.android.apps.messaging.R.id.tiktok_event_fragment_listeners, view, cls, eindVar);
        } else {
            ejwl.b(eaVar instanceof einn, "Fragments without views must implement EventReceiver to add a listener!");
            ((einn) eaVar).q(cls, eindVar);
        }
    }

    public static void d(View view, Class cls, eind eindVar) {
        k(com.google.android.apps.messaging.R.id.tiktok_event_view_listeners, view, cls, eindVar);
    }

    public static void e(einb einbVar, Activity activity) {
        View viewFindViewById = activity.findViewById(R.id.content);
        viewFindViewById.getClass();
        l(com.google.android.apps.messaging.R.id.tiktok_event_activity_listeners, einbVar, viewFindViewById);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void f(einb einbVar, ea eaVar) {
        View view = eaVar.Q;
        if (view != null) {
            l(com.google.android.apps.messaging.R.id.tiktok_event_fragment_listeners, einbVar, view);
            return;
        }
        ecem.c();
        if (eaVar instanceof einn) {
            eine eineVarP = ((einn) eaVar).p(einbVar);
            if (eineVarP == eine.a) {
                return;
            }
            if (eineVarP != eine.b) {
                einbVar = eineVarP.c;
            }
        }
        ea eaVar2 = eaVar.E;
        if (eaVar2 != null) {
            f(einbVar, eaVar2);
            return;
        }
        eg egVarG = eaVar.G();
        ejwl.b(egVarG != null, "Fragments must be attached to an Activity to receive events!");
        e(einbVar, egVarG);
    }

    public static void g(einb einbVar, View view) {
        view.getClass();
        l(com.google.android.apps.messaging.R.id.tiktok_event_view_listeners, einbVar, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static View h(ViewParent viewParent) {
        if (viewParent instanceof View) {
            return (View) viewParent;
        }
        if (viewParent != 0) {
            return h(viewParent.getParent());
        }
        return null;
    }

    private static cvw i(int i, View view) {
        return (cvw) view.getTag(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [einb, java.lang.Object] */
    private static ejwi j(int i, View view, ejwi ejwiVar) {
        eine eineVarA;
        if (ejwiVar.g()) {
            ?? C = ejwiVar.c();
            cvw cvwVarI = i(i, view);
            if (cvwVarI != null && !cvwVarI.isEmpty()) {
                Class<?> cls = C.getClass();
                int i2 = 0;
                while (true) {
                    if (i2 >= cvwVarI.d) {
                        eineVarA = eine.b;
                        break;
                    }
                    Class cls2 = (Class) cvwVarI.d(i2);
                    eind eindVar = (eind) cvwVarI.g(i2);
                    if (cls2.isAssignableFrom(cls)) {
                        eineVarA = eindVar.a(C);
                        break;
                    }
                    i2++;
                }
            } else {
                eineVarA = eine.b;
            }
            if (eineVarA == eine.a) {
                return ejud.a;
            }
            if (eineVarA != eine.b) {
                return ejwi.j(eineVarA.c);
            }
        }
        return ejwiVar;
    }

    private static void k(int i, View view, Class cls, eind eindVar) {
        ecem.c();
        cvw cvwVarI = i(i, view);
        if (cvwVarI == null) {
            cvwVarI = new csq();
            view.setTag(i, cvwVarI);
        }
        for (int i2 = 0; i2 < cvwVarI.d; i2++) {
            Class<?> cls2 = (Class) cvwVarI.d(i2);
            if (cls.equals(cls2)) {
                throw new IllegalArgumentException(String.format(Locale.US, "Class %s is already registered as a listener. Are you adding the same View instance twice?", cls.getSimpleName()));
            }
            if (cls.isAssignableFrom(cls2)) {
                throw new IllegalArgumentException(String.format(Locale.US, "For class %s, a listener is already registered as a subtype: %s", cls.getSimpleName(), cls2.getSimpleName()));
            }
            if (cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(String.format(Locale.US, "For class %s, a listener is already registered as a supertype: %s", cls.getSimpleName(), cls2.getSimpleName()));
            }
        }
        cvwVarI.put(cls, eindVar);
    }

    private static void l(int i, einb einbVar, View view) {
        ecem.c();
        ejwi ejwiVarJ = ejwi.j(einbVar);
        View viewH = view;
        while (viewH != null) {
            if (viewH != view || i == com.google.android.apps.messaging.R.id.tiktok_event_view_listeners) {
                ejwiVarJ = j(com.google.android.apps.messaging.R.id.tiktok_event_view_listeners, viewH, ejwiVarJ);
            }
            if (viewH != view || i != com.google.android.apps.messaging.R.id.tiktok_event_activity_listeners) {
                ejwiVarJ = j(com.google.android.apps.messaging.R.id.tiktok_event_fragment_listeners, viewH, ejwiVarJ);
            }
            ejwiVarJ = j(com.google.android.apps.messaging.R.id.tiktok_event_activity_listeners, viewH, ejwiVarJ);
            if (!ejwiVarJ.g()) {
                return;
            }
            Object tag = viewH.getTag(com.google.android.apps.messaging.R.id.tiktok_event_parent);
            if (tag != null && !(tag instanceof View)) {
                throw new IllegalStateException("Invalid tag returned: " + String.valueOf(tag.getClass()) + tag.toString() + " for view " + viewH.toString());
            }
            View view2 = (View) tag;
            viewH = view2 != null ? view2 : h(viewH.getParent());
        }
    }
}
