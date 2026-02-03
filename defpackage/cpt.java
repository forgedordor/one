package defpackage;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarText;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpt {
    public static final cpt a;
    public static final cpt b;
    private static final cpt n;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final cpw j;
    public final Set k;
    public final Set l;
    public final Set m;

    static {
        cps cpsVar = new cps();
        cpsVar.d = 1;
        cpsVar.c();
        cpsVar.i = false;
        cpt cptVar = new cpt(cpsVar);
        a = cptVar;
        cps cpsVar2 = new cps();
        cpsVar2.d = 2;
        cpsVar2.c();
        cpsVar2.i = true;
        new cpt(cpsVar2);
        cps cpsVar3 = new cps();
        cpsVar3.k = cpw.a;
        cpsVar3.d = 2;
        cpt cptVar2 = new cpt(cpsVar3);
        n = cptVar2;
        cps cpsVar4 = new cps(cptVar2);
        cpsVar4.k = cpw.c;
        cpsVar4.f = 2;
        cpsVar4.i = true;
        new cpt(cpsVar4);
        cps cpsVar5 = new cps(cptVar2);
        cpsVar5.k = cpw.c;
        cpsVar5.f = 2;
        cpsVar5.b();
        cpsVar5.i = true;
        new cpt(cpsVar5);
        cps cpsVar6 = new cps(cptVar2);
        cpsVar6.f = 1;
        cpsVar6.k = cpw.d;
        cpsVar6.i = true;
        cpsVar6.d();
        new cpt(cpsVar6);
        cps cpsVar7 = new cps(cptVar2);
        cpsVar7.d = 4;
        cpsVar7.f = 4;
        cpsVar7.b();
        cpsVar7.k = cpw.e;
        cpsVar7.i = true;
        cpsVar7.d();
        new cpt(cpsVar7);
        cps cpsVar8 = new cps(cptVar2);
        cpsVar8.d = 4;
        cpsVar8.b();
        cpsVar8.i = true;
        cpsVar8.d();
        new cpt(cpsVar8);
        cps cpsVar9 = new cps();
        cpsVar9.d = 2;
        cpsVar9.f = 2;
        cpsVar9.b();
        cpsVar9.a(1);
        cpsVar9.i = true;
        new cpt(cpsVar9);
        cps cpsVar10 = new cps();
        cpsVar10.d = 1;
        cpsVar10.f = 1;
        cpsVar10.a(1);
        cpsVar10.c();
        cpsVar10.i = true;
        new cpt(cpsVar10);
        cps cpsVar11 = new cps();
        cpsVar11.d = 2;
        cpsVar11.a(1);
        cpsVar11.a(Action.TYPE_COMPOSE_MESSAGE);
        cpsVar11.c();
        cpsVar11.h = true;
        cpsVar11.i = true;
        b = new cpt(cpsVar11);
        cps cpsVar12 = new cps(cptVar);
        cpsVar12.a.add(Integer.valueOf(Action.TYPE_APP_ICON));
        new cpt(cpsVar12);
    }

    public cpt(cps cpsVar) {
        int i = cpsVar.d;
        this.c = i;
        this.d = cpsVar.e;
        this.e = cpsVar.f;
        this.j = cpsVar.k;
        this.f = cpsVar.g;
        this.g = cpsVar.h;
        this.h = cpsVar.i;
        this.i = cpsVar.j;
        HashSet hashSet = new HashSet(cpsVar.a);
        this.k = hashSet;
        HashSet hashSet2 = new HashSet(cpsVar.c);
        this.m = hashSet2;
        HashSet hashSet3 = new HashSet(cpsVar.b);
        hashSet3.retainAll(hashSet);
        if (!hashSet3.isEmpty()) {
            throw new IllegalArgumentException("Disallowed action types cannot also be in the required set");
        }
        if (!cpsVar.b.isEmpty() && !hashSet2.isEmpty()) {
            throw new IllegalArgumentException("Both disallowed and allowed action type set cannot be defined.");
        }
        this.l = new HashSet(cpsVar.b);
        if (hashSet.size() > i) {
            throw new IllegalArgumentException("Required action types exceeded max allowed actions");
        }
    }

    public final void a(List list) {
        Set set = this.k;
        Set hashSet = set.isEmpty() ? Collections.EMPTY_SET : new HashSet(set);
        int i = this.e;
        int i2 = this.d;
        int i3 = this.c;
        Iterator it = list.iterator();
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        while (it.hasNext()) {
            Action action = (Action) it.next();
            Set set2 = this.l;
            if (!set2.isEmpty() && set2.contains(Integer.valueOf(action.getType()))) {
                throw new IllegalArgumentException(Action.typeToString(action.getType()).concat(" is disallowed"));
            }
            Set set3 = this.m;
            if (!set3.isEmpty() && !set3.contains(Integer.valueOf(action.getType()))) {
                throw new IllegalArgumentException(Action.typeToString(action.getType()).concat(" is not allowed"));
            }
            hashSet.remove(Integer.valueOf(action.getType()));
            CarText title = action.getTitle();
            if (title != null && !title.isEmpty()) {
                i4--;
                if (i4 < 0) {
                    throw new IllegalArgumentException(a.e(i, "Action list exceeded max number of ", " actions with custom titles"));
                }
                this.j.a(title);
            }
            i6--;
            if (i6 < 0) {
                throw new IllegalArgumentException(a.e(i3, "Action list exceeded max number of ", " actions"));
            }
            if ((action.getFlags() & 1) != 0 && i5 - 1 < 0) {
                throw new IllegalArgumentException(a.e(i2, "Action list exceeded max number of ", " primary actions"));
            }
            if (this.f && action.getIcon() == null && !action.isStandard()) {
                throw new IllegalArgumentException("Non-standard actions without an icon are disallowed");
            }
            if (this.g) {
                if ((action.getBackgroundColor() == null || CarColor.DEFAULT.equals(action.getBackgroundColor())) && !action.isStandard()) {
                    throw new IllegalArgumentException("Non-standard actions without a background color are disallowed");
                }
            } else if (!CarColor.DEFAULT.equals(action.getBackgroundColor()) && this.i && (action.getFlags() & 1) == 0) {
                throw new IllegalArgumentException("Background color can only be set for primary actions");
            }
            if (!this.h && action.getOnClickDelegate() != null && !action.isStandard()) {
                throw new IllegalArgumentException("Setting a click listener for a custom action is disallowed");
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            sb.append(Action.typeToString(((Integer) it2.next()).intValue()));
            sb.append(",");
        }
        sb.toString();
        throw new IllegalArgumentException("Missing required action types: ".concat(sb.toString()));
    }
}
