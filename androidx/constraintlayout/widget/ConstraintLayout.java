package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.model.Alert;
import defpackage.krz;
import defpackage.ksa;
import defpackage.ksd;
import defpackage.kse;
import defpackage.ktc;
import defpackage.kte;
import defpackage.ktf;
import defpackage.kti;
import defpackage.ktp;
import defpackage.ktq;
import defpackage.ktr;
import defpackage.ktt;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    final SparseArray a;
    public final ArrayList b;
    protected final ksa c;
    public int d;
    protected boolean e;
    public int f;
    public ktp g;
    final ktf h;
    private int i;
    private int j;
    private int k;
    private int l;
    private HashMap m;
    private final SparseArray n;

    public ConstraintLayout(Context context) throws XmlPullParserException, IOException, NumberFormatException {
        super(context);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new ksa();
        this.i = 0;
        this.d = 0;
        this.j = Alert.DURATION_SHOW_INDEFINITELY;
        this.k = Alert.DURATION_SHOW_INDEFINITELY;
        this.e = true;
        this.f = 257;
        this.g = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.h = new ktf(this, this);
        e(null, 0, 0);
    }

    private final void e(AttributeSet attributeSet, int i, int i2) throws XmlPullParserException, IOException, NumberFormatException {
        ksa ksaVar = this.c;
        ksaVar.aq = this;
        ksaVar.af(this.h);
        this.a.put(getId(), this);
        this.g = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ktt.b, i, i2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.i = typedArrayObtainStyledAttributes.getDimensionPixelOffset(16, this.i);
                } else if (index == 17) {
                    this.d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(17, this.d);
                } else if (index == 14) {
                    this.j = typedArrayObtainStyledAttributes.getDimensionPixelOffset(14, this.j);
                } else if (index == 15) {
                    this.k = typedArrayObtainStyledAttributes.getDimensionPixelOffset(15, this.k);
                } else if (index == 113) {
                    this.f = typedArrayObtainStyledAttributes.getInt(113, this.f);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(56, 0);
                    if (resourceId != 0) {
                        try {
                            kti.a(getContext(), resourceId, new SparseArray(), new SparseArray());
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(34, 0);
                    try {
                        ktp ktpVar = new ktp();
                        this.g = ktpVar;
                        ktpVar.j(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.g = null;
                    }
                    this.l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.c.ag(this.f);
    }

    private final void f() {
        this.e = true;
    }

    private final void g() throws IllegalAccessException, NoSuchFieldException, Resources.NotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i;
        int i2;
        krz krzVar;
        krz krzVar2;
        krz krzVar3;
        krz krzVar4;
        boolean z;
        krz krzVar5;
        ConstraintLayout constraintLayout = this;
        boolean zIsInEditMode = constraintLayout.isInEditMode();
        int childCount = constraintLayout.getChildCount();
        boolean z2 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            krz krzVarGS = constraintLayout.gS(constraintLayout.getChildAt(i3));
            if (krzVarGS != null) {
                krzVarGS.u();
            }
        }
        if (zIsInEditMode) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = constraintLayout.getChildAt(i4);
                try {
                    String resourceName = constraintLayout.getResources().getResourceName(childAt.getId());
                    int id = childAt.getId();
                    Integer numValueOf = Integer.valueOf(id);
                    if (resourceName instanceof String) {
                        if (constraintLayout.m == null) {
                            constraintLayout.m = new HashMap();
                        }
                        int iIndexOf = resourceName.indexOf("/");
                        String strSubstring = iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName;
                        numValueOf.getClass();
                        constraintLayout.m.put(strSubstring, Integer.valueOf(id));
                    }
                    int iIndexOf2 = resourceName.indexOf(47);
                    if (iIndexOf2 != -1) {
                        resourceName = resourceName.substring(iIndexOf2 + 1);
                    }
                    int id2 = childAt.getId();
                    if (id2 == 0) {
                        krzVar5 = constraintLayout.c;
                    } else {
                        View viewFindViewById = (View) constraintLayout.a.get(id2);
                        if (viewFindViewById == null && (viewFindViewById = constraintLayout.findViewById(id2)) != null && viewFindViewById != constraintLayout && viewFindViewById.getParent() == constraintLayout) {
                            constraintLayout.onViewAdded(viewFindViewById);
                        }
                        krzVar5 = viewFindViewById == constraintLayout ? constraintLayout.c : viewFindViewById == null ? null : ((kte) viewFindViewById.getLayoutParams()).av;
                    }
                    krzVar5.as = resourceName;
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (constraintLayout.l != -1) {
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt2 = constraintLayout.getChildAt(i5);
                if (childAt2.getId() == constraintLayout.l && (childAt2 instanceof ktq)) {
                    throw null;
                }
            }
        }
        ktp ktpVar = constraintLayout.g;
        if (ktpVar != null) {
            ktpVar.n(constraintLayout);
        }
        ksa ksaVar = constraintLayout.c;
        ksaVar.ao();
        ArrayList arrayList = constraintLayout.b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ktc ktcVar = (ktc) arrayList.get(i6);
                if (ktcVar.isInEditMode()) {
                    ktcVar.h(ktcVar.f);
                }
                kse kseVar = ktcVar.i;
                if (kseVar != null) {
                    kseVar.aM = 0;
                    Arrays.fill(kseVar.aL, (Object) null);
                    for (int i7 = 0; i7 < ktcVar.d; i7++) {
                        int i8 = ktcVar.c[i7];
                        View viewA = constraintLayout.a(i8);
                        if (viewA == null) {
                            HashMap map = ktcVar.h;
                            String str = (String) map.get(Integer.valueOf(i8));
                            int iD = ktcVar.d(constraintLayout, str);
                            if (iD != 0) {
                                ktcVar.c[i7] = iD;
                                map.put(Integer.valueOf(iD), str);
                                viewA = constraintLayout.a(iD);
                            }
                        }
                        if (viewA != null) {
                            ktcVar.i.af(constraintLayout.gS(viewA));
                        }
                    }
                    ktcVar.i.ah();
                }
            }
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt3 = constraintLayout.getChildAt(i9);
            if (childAt3 instanceof ktr) {
                throw null;
            }
        }
        SparseArray sparseArray = constraintLayout.n;
        sparseArray.clear();
        sparseArray.put(0, ksaVar);
        sparseArray.put(constraintLayout.getId(), ksaVar);
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt4 = constraintLayout.getChildAt(i10);
            sparseArray.put(childAt4.getId(), constraintLayout.gS(childAt4));
        }
        int i11 = 0;
        while (i11 < childCount) {
            View childAt5 = constraintLayout.getChildAt(i11);
            krz krzVarGS2 = constraintLayout.gS(childAt5);
            if (krzVarGS2 == null) {
                z = z2;
            } else {
                kte kteVar = (kte) childAt5.getLayoutParams();
                ksaVar.am(krzVarGS2);
                kteVar.a();
                kteVar.aw = z2;
                krzVarGS2.ar = childAt5.getVisibility();
                boolean z3 = kteVar.aj;
                krzVarGS2.aq = childAt5;
                if (childAt5 instanceof ktc) {
                    ((ktc) childAt5).c(krzVarGS2, ksaVar.e);
                }
                if (kteVar.ah) {
                    ksd ksdVar = (ksd) krzVarGS2;
                    int i12 = kteVar.as;
                    int i13 = kteVar.at;
                    float f = kteVar.au;
                    if (f != -1.0f) {
                        ksdVar.af(f);
                    } else if (i12 != -1) {
                        ksdVar.c(i12);
                    } else if (i13 != -1) {
                        ksdVar.ae(i13);
                    }
                    z = z2;
                } else {
                    int i14 = kteVar.al;
                    int i15 = kteVar.am;
                    int i16 = kteVar.an;
                    int i17 = kteVar.ao;
                    int i18 = kteVar.ap;
                    int i19 = kteVar.aq;
                    float f2 = kteVar.ar;
                    int i20 = kteVar.p;
                    if (i20 != -1) {
                        krz krzVar6 = (krz) sparseArray.get(i20);
                        if (krzVar6 != null) {
                            krzVarGS2.r(krzVar6, kteVar.r, kteVar.q);
                        }
                    } else {
                        if (i14 != -1) {
                            krz krzVar7 = (krz) sparseArray.get(i14);
                            if (krzVar7 != null) {
                                i2 = i19;
                                i = i17;
                                krzVarGS2.aa(2, krzVar7, 2, kteVar.leftMargin, i18);
                            } else {
                                i = i17;
                                i2 = i19;
                            }
                        } else {
                            i = i17;
                            i2 = i19;
                            if (i15 != -1 && (krzVar = (krz) sparseArray.get(i15)) != null) {
                                krzVarGS2.aa(2, krzVar, 4, kteVar.leftMargin, i18);
                            }
                        }
                        if (i16 != -1) {
                            krz krzVar8 = (krz) sparseArray.get(i16);
                            if (krzVar8 != null) {
                                krzVarGS2.aa(4, krzVar8, 2, kteVar.rightMargin, i2);
                            }
                        } else {
                            int i21 = i2;
                            if (i != -1 && (krzVar2 = (krz) sparseArray.get(i)) != null) {
                                krzVarGS2.aa(4, krzVar2, 4, kteVar.rightMargin, i21);
                            }
                        }
                        int i22 = kteVar.i;
                        if (i22 != -1) {
                            krz krzVar9 = (krz) sparseArray.get(i22);
                            if (krzVar9 != null) {
                                krzVarGS2.aa(3, krzVar9, 3, kteVar.topMargin, kteVar.x);
                            }
                        } else {
                            int i23 = kteVar.j;
                            if (i23 != -1 && (krzVar3 = (krz) sparseArray.get(i23)) != null) {
                                krzVarGS2.aa(3, krzVar3, 5, kteVar.topMargin, kteVar.x);
                            }
                        }
                        int i24 = kteVar.k;
                        if (i24 != -1) {
                            krz krzVar10 = (krz) sparseArray.get(i24);
                            if (krzVar10 != null) {
                                krzVarGS2.aa(5, krzVar10, 3, kteVar.bottomMargin, kteVar.z);
                            }
                        } else {
                            int i25 = kteVar.l;
                            if (i25 != -1 && (krzVar4 = (krz) sparseArray.get(i25)) != null) {
                                krzVarGS2.aa(5, krzVar4, 5, kteVar.bottomMargin, kteVar.z);
                            }
                        }
                        int i26 = kteVar.m;
                        if (i26 != -1) {
                            h(krzVarGS2, kteVar, sparseArray, i26, 6);
                        } else {
                            int i27 = kteVar.n;
                            if (i27 != -1) {
                                h(krzVarGS2, kteVar, sparseArray, i27, 3);
                            } else {
                                int i28 = kteVar.o;
                                if (i28 != -1) {
                                    h(krzVarGS2, kteVar, sparseArray, i28, 5);
                                }
                            }
                        }
                        if (f2 >= 0.0f) {
                            krzVarGS2.ao = f2;
                        }
                        float f3 = kteVar.H;
                        if (f3 >= 0.0f) {
                            krzVarGS2.ap = f3;
                        }
                    }
                    if (zIsInEditMode) {
                        int i29 = kteVar.X;
                        if (i29 != -1) {
                            int i30 = kteVar.Y;
                            krzVarGS2.aj = i29;
                            krzVarGS2.ak = i30;
                        } else if (kteVar.Y != -1) {
                            i29 = -1;
                            int i302 = kteVar.Y;
                            krzVarGS2.aj = i29;
                            krzVarGS2.ak = i302;
                        }
                    }
                    if (kteVar.ae) {
                        krzVarGS2.ab(1);
                        krzVarGS2.N(kteVar.width);
                        if (kteVar.width == -2) {
                            krzVarGS2.ab(2);
                        }
                    } else if (kteVar.width == -1) {
                        if (kteVar.aa) {
                            krzVarGS2.ab(3);
                        } else {
                            krzVarGS2.ab(4);
                        }
                        krzVarGS2.V(2).f = kteVar.leftMargin;
                        krzVarGS2.V(4).f = kteVar.rightMargin;
                    } else {
                        krzVarGS2.ab(3);
                        krzVarGS2.N(0);
                    }
                    if (kteVar.af) {
                        z = false;
                        krzVarGS2.ac(1);
                        krzVarGS2.C(kteVar.height);
                        if (kteVar.height == -2) {
                            krzVarGS2.ac(2);
                        }
                    } else if (kteVar.height == -1) {
                        if (kteVar.ab) {
                            krzVarGS2.ac(3);
                        } else {
                            krzVarGS2.ac(4);
                        }
                        krzVarGS2.V(3).f = kteVar.topMargin;
                        krzVarGS2.V(5).f = kteVar.bottomMargin;
                        z = false;
                    } else {
                        krzVarGS2.ac(3);
                        z = false;
                        krzVarGS2.C(0);
                    }
                    krzVarGS2.z(kteVar.I);
                    krzVarGS2.E(kteVar.L);
                    krzVarGS2.M(kteVar.M);
                    krzVarGS2.at = kteVar.N;
                    krzVarGS2.au = kteVar.O;
                    int i31 = kteVar.ad;
                    if (i31 >= 0 && i31 <= 3) {
                        krzVarGS2.B = i31;
                    }
                    krzVarGS2.D(kteVar.P, kteVar.R, kteVar.T, kteVar.V);
                    krzVarGS2.L(kteVar.Q, kteVar.S, kteVar.U, kteVar.W);
                }
            }
            i11++;
            z2 = z;
            constraintLayout = this;
        }
    }

    private final void h(krz krzVar, kte kteVar, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.a.get(i);
        krz krzVar2 = (krz) sparseArray.get(i);
        if (krzVar2 == null || view == null || !(view.getLayoutParams() instanceof kte)) {
            return;
        }
        kteVar.ag = true;
        if (i2 == 6) {
            kte kteVar2 = (kte) view.getLayoutParams();
            kteVar2.ag = true;
            kteVar2.av.P = true;
        }
        krzVar.V(6).n(krzVar2.V(i2), kteVar.D, kteVar.C, true);
        krzVar.P = true;
        krzVar.V(3).e();
        krzVar.V(5).e();
    }

    public final View a(int i) {
        return (View) this.a.get(i);
    }

    protected final boolean c() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && getLayoutDirection() == 1;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof kte;
    }

    public final Object d(Object obj) {
        HashMap map;
        if ((obj instanceof String) && (map = this.m) != null && map.containsKey(obj)) {
            return this.m.get(obj);
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) throws NumberFormatException {
        Object tag;
        int size;
        ArrayList arrayList = this.b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        int i6 = (int) ((i4 / 1920.0f) * height);
                        int i7 = (int) ((i3 / 1080.0f) * width);
                        float f = ((int) ((i5 / 1080.0f) * width)) + i7;
                        float f2 = i7;
                        float f3 = i6;
                        canvas.drawLine(f2, f3, f, f3, paint);
                        float f4 = i6 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f, f3, f, f4, paint);
                        canvas.drawLine(f, f4, f2, f4, paint);
                        canvas.drawLine(f2, f4, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f, f4, paint);
                        canvas.drawLine(f2, f4, f, f3, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        f();
        super.forceLayout();
    }

    public final krz gS(View view) {
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof kte) {
            return ((kte) view.getLayoutParams()).av;
        }
        view.setLayoutParams(new kte(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof kte) {
            return ((kte) view.getLayoutParams()).av;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new kte();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new kte(getContext(), attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            int r5 = r4.getChildCount()
            boolean r6 = r4.isInEditMode()
            r7 = 0
            r8 = r7
        La:
            if (r8 >= r5) goto L4f
            android.view.View r9 = r4.getChildAt(r8)
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            kte r0 = (defpackage.kte) r0
            krz r1 = r0.av
            int r2 = r9.getVisibility()
            r3 = 8
            if (r2 != r3) goto L2d
            boolean r2 = r0.ah
            if (r2 != 0) goto L2d
            boolean r2 = r0.ai
            if (r2 != 0) goto L2d
            boolean r2 = r0.ak
            if (r6 != 0) goto L2d
            goto L48
        L2d:
            boolean r0 = r0.aj
            int r0 = r1.k()
            int r2 = r1.l()
            int r3 = r1.j()
            int r3 = r3 + r0
            int r1 = r1.h()
            int r1 = r1 + r2
            r9.layout(r0, r2, r3, r1)
            boolean r0 = r9 instanceof defpackage.ktr
            if (r0 != 0) goto L4b
        L48:
            int r8 = r8 + 1
            goto La
        L4b:
            ktr r9 = (defpackage.ktr) r9
            r5 = 0
            throw r5
        L4f:
            java.util.ArrayList r5 = r4.b
            int r6 = r5.size()
            if (r6 <= 0) goto L62
        L57:
            if (r7 >= r6) goto L62
            java.lang.Object r8 = r5.get(r7)
            ktc r8 = (defpackage.ktc) r8
            int r7 = r7 + 1
            goto L57
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r22, int r23) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, android.content.res.Resources.NotFoundException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        boolean z = view instanceof Guideline;
        krz krzVarGS = gS(view);
        if (z && !(krzVarGS instanceof ksd)) {
            kte kteVar = (kte) view.getLayoutParams();
            kteVar.av = new ksd();
            kteVar.ah = true;
            ((ksd) kteVar.av).ag(kteVar.Z);
        }
        if (view instanceof ktc) {
            ktc ktcVar = (ktc) view;
            ktcVar.k();
            ((kte) view.getLayoutParams()).ai = true;
            ArrayList arrayList = this.b;
            if (!arrayList.contains(ktcVar)) {
                arrayList.add(ktcVar);
            }
        }
        this.a.put(view.getId(), view);
        this.e = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.c.an(gS(view));
        this.b.remove(view);
        this.e = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        f();
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setId(int i) {
        SparseArray sparseArray = this.a;
        sparseArray.remove(getId());
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new kte(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new ksa();
        this.i = 0;
        this.d = 0;
        this.j = Alert.DURATION_SHOW_INDEFINITELY;
        this.k = Alert.DURATION_SHOW_INDEFINITELY;
        this.e = true;
        this.f = 257;
        this.g = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.h = new ktf(this, this);
        e(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet, i);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new ksa();
        this.i = 0;
        this.d = 0;
        this.j = Alert.DURATION_SHOW_INDEFINITELY;
        this.k = Alert.DURATION_SHOW_INDEFINITELY;
        this.e = true;
        this.f = 257;
        this.g = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.h = new ktf(this, this);
        e(attributeSet, i, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) throws XmlPullParserException, IOException, NumberFormatException {
        super(context, attributeSet, i, i2);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new ksa();
        this.i = 0;
        this.d = 0;
        this.j = Alert.DURATION_SHOW_INDEFINITELY;
        this.k = Alert.DURATION_SHOW_INDEFINITELY;
        this.e = true;
        this.f = 257;
        this.g = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.h = new ktf(this, this);
        e(attributeSet, i, i2);
    }
}
