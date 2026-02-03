package defpackage;

import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dspg implements Serializable {
    public static final /* synthetic */ int a = 0;
    private static final eksp b = eksp.c("GnpSdk");
    private final Set c;

    public dspg(Set set) {
        this.c = set;
        ((eksl) ((eksl) b.h()).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/TargetElementFinder", "<init>", 28, "TargetElementFinder.java")).t("set is %s.", set);
    }

    public static View c(Activity activity, View view, ejvr ejvrVar) {
        View viewD;
        View viewE = e(view, ejvrVar);
        return (viewE != null || (viewD = dxuy.d(activity)) == null) ? viewE : e(viewD, ejvrVar);
    }

    private static View e(View view, ejvr ejvrVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(view);
        while (!arrayDeque.isEmpty()) {
            View view2 = (View) arrayDeque.poll();
            if (((Boolean) ejvrVar.apply(view2)).booleanValue()) {
                return view2;
            }
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    arrayDeque.offer(viewGroup.getChildAt(i));
                }
            }
        }
        return null;
    }

    public final View a(Activity activity, View view, String str) {
        View viewD;
        if (activity == null) {
            ((eksl) ((eksl) b.j()).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/TargetElementFinder", "findElementById", 40, "TargetElementFinder.java")).q("activity is null, can't find view.");
            return null;
        }
        Resources resources = activity.getResources();
        if (resources == null) {
            return null;
        }
        int identifier = resources.getIdentifier(str, "id", activity.getPackageName());
        if (identifier == 0) {
            ((eksl) ((eksl) b.j()).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/TargetElementFinder", "findElementById", 51, "TargetElementFinder.java")).t("Did not find resource with id %s", str);
            return null;
        }
        if (view == null) {
            view = activity.findViewById(R.id.content);
        }
        View viewFindViewById = view.findViewById(identifier);
        if (viewFindViewById == null && (viewD = dxuy.d(activity)) != null) {
            viewFindViewById = viewD.findViewById(identifier);
        }
        View rootView = view.getRootView();
        if (viewFindViewById == null && rootView != null) {
            viewFindViewById = rootView.findViewById(identifier);
        }
        if (viewFindViewById == null) {
            ((eksl) ((eksl) b.j()).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/TargetElementFinder", "findElementById", 73, "TargetElementFinder.java")).t("Did not find a view with id %s", str);
        }
        return viewFindViewById;
    }

    public final View b(Activity activity, View view, final String str) {
        if (activity == null) {
            ((eksl) ((eksl) b.j()).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/TargetElementFinder", "findElementByTag", 88, "TargetElementFinder.java")).q("activity is null, can't find view.");
            return null;
        }
        if (str == null) {
            ((eksl) ((eksl) b.j()).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/TargetElementFinder", "findElementByTag", 93, "TargetElementFinder.java")).q("Received null tag, can't find a view with tag.");
            return null;
        }
        if (view == null) {
            view = activity.findViewById(R.id.content);
        }
        View viewC = c(activity, view, new ejvr() { // from class: dspe
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i = dspg.a;
                return Boolean.valueOf(str.equals(((View) obj).getTag(com.google.android.apps.messaging.R.id.growthkit_view_tag)));
            }
        });
        View rootView = view.getRootView();
        if (viewC == null && rootView != null) {
            viewC = c(activity, rootView, new ejvr() { // from class: dspf
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    int i = dspg.a;
                    return Boolean.valueOf(str.equals(((View) obj).getTag(com.google.android.apps.messaging.R.id.growthkit_view_tag)));
                }
            });
        }
        if (viewC == null) {
            ((eksl) ((eksl) b.j()).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/TargetElementFinder", "findElementByTag", 112, "TargetElementFinder.java")).t("Did not find a view with tag %s", str);
        }
        return viewC;
    }

    public final View d(Activity activity) {
        if (activity == null) {
            ((eksl) ((eksl) b.j()).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/TargetElementFinder", "findElementByVeId", 122, "TargetElementFinder.java")).q("activity is null, can't find view.");
            return null;
        }
        Set set = this.c;
        if (set.isEmpty()) {
            ((eksl) ((eksl) b.i()).h("com/google/android/libraries/internal/growth/growthkit/internal/ui/impl/base/TargetElementFinder", "findElementByVeId", 127, "TargetElementFinder.java")).q("No Visual Element View Finder was bound, can't find View");
            return null;
        }
        ekqg ekqgVarListIterator = ((ekon) set).listIterator();
        while (ekqgVarListIterator.hasNext()) {
            View viewA = ((dssh) ekqgVarListIterator.next()).a();
            if (viewA != null) {
                return viewA;
            }
        }
        return null;
    }
}
