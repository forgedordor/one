package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class oc implements kzv {
    private static final int[] l = {1, 4, 5, 3, 2, 0};
    public final Context a;
    public oa b;
    public final ArrayList c;
    public final ArrayList d;
    CharSequence e;
    Drawable f;
    View g;
    public of j;
    public boolean k;
    private final Resources m;
    private boolean n;
    private final boolean o;
    private final ArrayList p;
    private boolean q;
    private final ArrayList r;
    private boolean s;
    private int t = 0;
    public boolean h = false;
    private boolean u = false;
    private boolean v = false;
    private boolean w = false;
    private final ArrayList x = new ArrayList();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();
    private boolean y = false;

    public oc(Context context) {
        Resources resources;
        int iB;
        boolean z = false;
        this.a = context;
        Resources resources2 = context.getResources();
        this.m = resources2;
        this.c = new ArrayList();
        this.p = new ArrayList();
        this.q = true;
        this.d = new ArrayList();
        this.r = new ArrayList();
        this.s = true;
        if (resources2.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT < 28 ? !((iB = lfb.b((resources = context.getResources()), "config_showMenuShortcutsWhenKeyboardPresent", "bool")) == 0 || !resources.getBoolean(iB)) : viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent()) {
                z = true;
            }
        }
        this.o = z;
    }

    private final void E(int i, boolean z) {
        if (i >= 0) {
            ArrayList arrayList = this.c;
            if (i >= arrayList.size()) {
                return;
            }
            arrayList.remove(i);
            if (z) {
                l(true);
            }
        }
    }

    public final boolean A(MenuItem menuItem, op opVar, int i) {
        boolean zH;
        of ofVar = (of) menuItem;
        if (ofVar != null && ofVar.isEnabled()) {
            boolean zN = ofVar.n();
            lco lcoVar = ofVar.p;
            boolean z = lcoVar != null && lcoVar.hasSubMenu();
            if (ofVar.m()) {
                boolean zExpandActionView = ofVar.expandActionView() | zN;
                if (!zExpandActionView) {
                    return zExpandActionView;
                }
                i(true);
                return true;
            }
            if (!ofVar.hasSubMenu() && !z) {
                if ((i & 1) != 0) {
                    return zN;
                }
                i(true);
                return zN;
            }
            if ((i & 4) == 0) {
                i(false);
            }
            if (!ofVar.hasSubMenu()) {
                ofVar.l(new ox(this.a, this, ofVar));
            }
            ox oxVar = ofVar.l;
            if (z) {
                lcoVar.onPrepareSubMenu(oxVar);
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.i;
            if (copyOnWriteArrayList.isEmpty()) {
                zH = false;
            } else {
                zH = opVar != null ? opVar.h(oxVar) : false;
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    op opVar2 = (op) weakReference.get();
                    if (opVar2 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else if (!zH) {
                        zH = opVar2.h(oxVar);
                    }
                }
            }
            boolean z2 = zN | zH;
            if (z2) {
                return z2;
            }
            i(true);
        }
        return false;
    }

    final void B() {
        this.s = true;
        l(true);
    }

    final void C() {
        this.q = true;
        l(true);
    }

    public final void D() {
        this.t = 1;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return c(0, 0, 0, this.m.getString(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem menuItemC = c(i, i2, i3, resolveInfo.loadLabel(packageManager));
            menuItemC.setIcon(resolveInfo.loadIcon(packageManager));
            ((of) menuItemC).f = intent2;
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = menuItemC;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.m.getString(i));
    }

    final of b(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.x;
        arrayList.clear();
        j(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (of) arrayList.get(0);
        }
        boolean zX = x();
        for (int i2 = 0; i2 < size; i2++) {
            of ofVar = (of) arrayList.get(i2);
            char c = zX ? ofVar.i : ofVar.g;
            if ((c == keyData.meta[0] && (metaState & 2) == 0) || ((c == keyData.meta[2] && (metaState & 2) != 0) || (zX && c == '\b' && i == 67))) {
                return ofVar;
            }
        }
        return null;
    }

    protected MenuItem c(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = i3 >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (l[i5] << 16) | ((char) i3);
        of ofVar = new of(this, i, i2, i3, i6, charSequence, this.t);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((of) arrayList.get(size)).d <= i6) {
                i4 = size + 1;
                break;
            }
        }
        arrayList.add(i4, ofVar);
        l(true);
        return ofVar;
    }

    @Override // android.view.Menu
    public final void clear() {
        of ofVar = this.j;
        if (ofVar != null) {
            t(ofVar);
        }
        this.c.clear();
        l(true);
    }

    public final void clearHeader() {
        this.f = null;
        this.e = null;
        this.g = null;
        l(false);
    }

    @Override // android.view.Menu
    public final void close() {
        i(true);
    }

    protected String d() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList e() {
        k();
        return this.r;
    }

    public final ArrayList f() {
        if (!this.q) {
            return this.p;
        }
        ArrayList arrayList = this.p;
        arrayList.clear();
        ArrayList arrayList2 = this.c;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            of ofVar = (of) arrayList2.get(i);
            if (ofVar.isVisible()) {
                arrayList.add(ofVar);
            }
        }
        this.q = false;
        this.s = true;
        return arrayList;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            of ofVar = (of) this.c.get(i2);
            if (ofVar.a == i) {
                return ofVar;
            }
            if (ofVar.hasSubMenu() && (menuItemFindItem = ofVar.l.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public final void g(op opVar) {
        h(opVar, this.a);
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.c.get(i);
    }

    public final void h(op opVar, Context context) {
        this.i.add(new WeakReference(opVar));
        opVar.c(context, this);
        this.s = true;
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.k) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((of) this.c.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i(boolean z) {
        if (this.w) {
            return;
        }
        this.w = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.i;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            op opVar = (op) weakReference.get();
            if (opVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                opVar.d(this, z);
            }
        }
        this.w = false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return b(i, keyEvent) != null;
    }

    final void j(List list, int i, KeyEvent keyEvent) {
        int i2;
        boolean zX = x();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData)) {
            i2 = i;
        } else if (i != 67) {
            return;
        } else {
            i2 = 67;
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            of ofVar = (of) arrayList.get(i3);
            if (ofVar.hasSubMenu()) {
                ofVar.l.j(list, i2, keyEvent);
            }
            char c = zX ? ofVar.i : ofVar.g;
            if ((modifiers & 69647) == ((zX ? ofVar.j : ofVar.h) & 69647) && c != 0 && ((c == keyData.meta[0] || c == keyData.meta[2] || (zX && c == '\b' && i2 == 67)) && ofVar.isEnabled())) {
                list.add(ofVar);
            }
        }
    }

    public final void k() {
        ArrayList arrayListF = f();
        if (this.s) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.i;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean zG = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                op opVar = (op) weakReference.get();
                if (opVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zG |= opVar.g();
                }
            }
            if (zG) {
                ArrayList arrayList = this.d;
                arrayList.clear();
                ArrayList arrayList2 = this.r;
                arrayList2.clear();
                int size = arrayListF.size();
                for (int i = 0; i < size; i++) {
                    of ofVar = (of) arrayListF.get(i);
                    if (ofVar.o()) {
                        arrayList.add(ofVar);
                    } else {
                        arrayList2.add(ofVar);
                    }
                }
            } else {
                this.d.clear();
                ArrayList arrayList3 = this.r;
                arrayList3.clear();
                arrayList3.addAll(f());
            }
            this.s = false;
        }
    }

    public final void l(boolean z) {
        boolean z2 = true;
        if (this.h) {
            this.u = true;
            if (z) {
                this.v = true;
                return;
            }
            return;
        }
        if (z) {
            this.q = true;
            this.s = true;
        } else {
            z2 = false;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.i;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            op opVar = (op) weakReference.get();
            if (opVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                opVar.f(z2);
            }
        }
        r();
    }

    public final void m(op opVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.i;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            op opVar2 = (op) weakReference.get();
            if (opVar2 == null || opVar2 == opVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    public final void n(Bundle bundle) {
        MenuItem menuItemFindItem;
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(d());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((ox) item.getSubMenu()).n(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public final void o(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((ox) item.getSubMenu()).o(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(d(), sparseArray);
        }
    }

    public void p(oa oaVar) {
        this.b = oaVar;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return z(findItem(i), i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        of ofVarB = b(i, keyEvent);
        boolean z = ofVarB != null ? z(ofVarB, i2) : false;
        if ((i2 & 2) != 0) {
            i(true);
        }
        return z;
    }

    public final void q(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.g = view;
            this.e = null;
            this.f = null;
        } else {
            if (i > 0) {
                this.e = this.m.getText(i);
            } else if (charSequence != null) {
                this.e = charSequence;
            }
            if (i2 > 0) {
                this.f = this.a.getDrawable(i2);
            } else if (drawable != null) {
                this.f = drawable;
            }
            this.g = null;
        }
        l(false);
    }

    public final void r() {
        this.h = false;
        if (this.u) {
            this.u = false;
            l(this.v);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((of) this.c.get(i2)).b == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            ArrayList arrayList = this.c;
            int size2 = arrayList.size() - i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size2 || ((of) arrayList.get(i2)).b != i) {
                    break;
                }
                E(i2, false);
                i3 = i4;
            }
            l(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((of) this.c.get(i2)).a == i) {
                break;
            } else {
                i2++;
            }
        }
        E(i2, true);
    }

    public final void s() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.u = false;
        this.v = false;
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            of ofVar = (of) arrayList.get(i2);
            if (ofVar.b == i) {
                ofVar.j(z2);
                ofVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.y = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            of ofVar = (of) arrayList.get(i2);
            if (ofVar.b == i) {
                ofVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            of ofVar = (of) arrayList.get(i2);
            if (ofVar.b == i && ofVar.s(z)) {
                z2 = true;
            }
        }
        if (z2) {
            l(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.n = z;
        l(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.c.size();
    }

    public boolean t(of ofVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.i;
        boolean zI = false;
        if (!copyOnWriteArrayList.isEmpty() && this.j == ofVar) {
            s();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                op opVar = (op) weakReference.get();
                if (opVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zI = opVar.i(ofVar);
                    if (zI) {
                        break;
                    }
                }
            }
            r();
            if (zI) {
                this.j = null;
            }
        }
        return zI;
    }

    public boolean u(oc ocVar, MenuItem menuItem) {
        oa oaVar = this.b;
        return oaVar != null && oaVar.L(ocVar, menuItem);
    }

    public boolean v(of ofVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.i;
        boolean zJ = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            op opVar = (op) weakReference.get();
            if (opVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                zJ = opVar.j(ofVar);
                if (zJ) {
                    break;
                }
            }
        }
        r();
        if (zJ) {
            this.j = ofVar;
        }
        return zJ;
    }

    public boolean w() {
        return this.y;
    }

    public boolean x() {
        return this.n;
    }

    public boolean y() {
        return this.o;
    }

    public final boolean z(MenuItem menuItem, int i) {
        return A(menuItem, null, i);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return c(i, i2, i3, this.m.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.m.getString(i4));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return c(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        of ofVar = (of) c(i, i2, i3, charSequence);
        ox oxVar = new ox(this.a, this, ofVar);
        ofVar.l(oxVar);
        return oxVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return c(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public oc a() {
        return this;
    }
}
