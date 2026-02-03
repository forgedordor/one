package defpackage;

import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lex {
    public static final ArrayList a = new ArrayList();
    public WeakHashMap b = null;
    private SparseArray d = null;
    public WeakReference c = null;

    static lex c(View view) {
        lex lexVar = (lex) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (lexVar != null) {
            return lexVar;
        }
        lex lexVar2 = new lex();
        view.setTag(R.id.tag_unhandled_key_event_manager, lexVar2);
        return lexVar2;
    }

    public static final boolean d(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null) {
            return false;
        }
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                return false;
            }
        } while (!((lew) arrayList.get(size)).a());
        return true;
    }

    public final SparseArray a() {
        if (this.d == null) {
            this.d = new SparseArray();
        }
        return this.d;
    }

    public final View b(View view, KeyEvent keyEvent) {
        View viewB;
        WeakHashMap weakHashMap = this.b;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                do {
                    childCount--;
                    if (childCount >= 0) {
                        viewB = b(viewGroup.getChildAt(childCount), keyEvent);
                    }
                } while (viewB == null);
                return viewB;
            }
            if (d(view)) {
                return view;
            }
        }
        return null;
    }
}
