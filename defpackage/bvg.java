package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvg {
    private static final double e = Math.sqrt(2.3703703703703702d);
    public final Rational a;
    public final Rational b;
    public final Set c;
    public final bir d;
    private final Size f;
    private final brj g;
    private final Map h;

    public bvg(biu biuVar, Set set) {
        bgz bgzVar = (bgz) biuVar;
        Size sizeI = boy.i(bgzVar.a.e());
        bgy bgyVar = bgzVar.a;
        brj brjVar = new brj(bgyVar, sizeI);
        this.h = new HashMap();
        this.f = sizeI;
        Rational rational = ((double) sizeI.getWidth()) / ((double) sizeI.getHeight()) > e ? bno.c : bno.a;
        bbs.a("ResolutionsMerger", a.j(rational, sizeI, "The closer aspect ratio to the sensor size (", ") is ", "."));
        this.a = rational;
        Rational rational2 = bno.a;
        if (rational.equals(rational2)) {
            rational2 = bno.c;
        } else if (!rational.equals(bno.c)) {
            Objects.toString(rational);
            throw new IllegalArgumentException("Invalid sensor aspect-ratio: ".concat(String.valueOf(rational)));
        }
        this.b = rational2;
        this.d = bgyVar;
        this.c = set;
        this.g = brjVar;
    }

    public static float a(Rational rational, Rational rational2) {
        float fFloatValue = rational.floatValue();
        float fFloatValue2 = rational2.floatValue();
        return fFloatValue > fFloatValue2 ? fFloatValue2 / fFloatValue : fFloatValue / fFloatValue2;
    }

    static Rect b(Size size, Size size2) {
        RectF rectF;
        RectF rectF2;
        Rational rationalI = i(size2);
        float width = size.getWidth();
        float height = size.getHeight();
        Rational rationalI2 = i(size);
        if (rationalI.floatValue() == rationalI2.floatValue()) {
            rectF2 = new RectF(0.0f, 0.0f, width, height);
        } else {
            if (rationalI.floatValue() > rationalI2.floatValue()) {
                float fFloatValue = width / rationalI.floatValue();
                float f = (height - fFloatValue) / 2.0f;
                rectF = new RectF(0.0f, f, width, fFloatValue + f);
            } else {
                float fFloatValue2 = rationalI.floatValue() * height;
                float f2 = (width - fFloatValue2) / 2.0f;
                rectF = new RectF(f2, 0.0f, fFloatValue2 + f2, height);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    static Rect c(Rect rect) {
        return new Rect(rect.top, rect.left, rect.bottom, rect.right);
    }

    static boolean h(Size size, Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    private static Rational i(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    private static Rational j(Size size) {
        Rational rational = bno.a;
        if (bno.a(size, rational)) {
            return rational;
        }
        Rational rational2 = bno.c;
        return bno.a(size, rational2) ? rational2 : i(size);
    }

    private final boolean k(Rational rational, Size size) {
        Rational rational2 = this.a;
        if (!rational2.equals(rational) && !bno.a(size, rational)) {
            float fFloatValue = rational2.floatValue();
            float fFloatValue2 = rational.floatValue();
            float fFloatValue3 = j(size).floatValue();
            if (fFloatValue != fFloatValue2 && fFloatValue2 != fFloatValue3) {
                if (fFloatValue > fFloatValue2) {
                    if (fFloatValue2 < fFloatValue3) {
                        return true;
                    }
                } else if (fFloatValue2 > fFloatValue3) {
                    return true;
                }
            }
        }
        return false;
    }

    final bve d(bni bniVar, Rect rect, int i, boolean z) {
        boolean z2;
        Size size;
        Size size2;
        Pair pairCreate;
        if (boy.n(i)) {
            rect = c(rect);
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            Size sizeI = boy.i(rect);
            Iterator it = e(bniVar).iterator();
            while (true) {
                if (!it.hasNext()) {
                    pairCreate = Pair.create(sizeI, sizeI);
                    break;
                }
                Size size3 = (Size) it.next();
                Size sizeI2 = boy.i(b(size3, sizeI));
                if (!h(sizeI2, sizeI)) {
                    pairCreate = Pair.create(size3, sizeI2);
                    break;
                }
            }
            size = (Size) pairCreate.first;
            size2 = (Size) pairCreate.second;
        } else {
            Size sizeI3 = boy.i(rect);
            List listE = e(bniVar);
            Iterator it2 = listE.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    Iterator it3 = listE.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            size = sizeI3;
                            break;
                        }
                        size = (Size) it3.next();
                        if (!h(size, sizeI3)) {
                            break;
                        }
                    }
                } else {
                    Size size4 = (Size) it2.next();
                    if (!k(j(sizeI3), size4) && !h(size4, sizeI3)) {
                        size = size4;
                        break;
                    }
                }
            }
            rect = b(sizeI3, size);
            size2 = size;
        }
        bve bveVar = new bve(rect, size2, size);
        if (!z2) {
            return bveVar;
        }
        Rect rect2 = bveVar.a;
        Size size5 = bveVar.b;
        return new bve(c(rect2), boy.j(size5), bveVar.c);
    }

    public final List e(bni bniVar) {
        Rational rationalI;
        if (!this.c.contains(bniVar)) {
            Objects.toString(bniVar);
            throw new IllegalArgumentException("Invalid child config: ".concat(String.valueOf(bniVar)));
        }
        Map map = this.h;
        if (map.containsKey(bniVar)) {
            List list = (List) map.get(bniVar);
            list.getClass();
            return list;
        }
        List<Size> listC = this.g.c(bniVar);
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Size size : listC) {
            Iterator it = map2.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    rationalI = null;
                    break;
                }
                rationalI = (Rational) it.next();
                if (bno.a(size, rationalI)) {
                    break;
                }
            }
            if (rationalI != null) {
                Size size2 = (Size) map2.get(rationalI);
                size2.getClass();
                if (size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth() || (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight())) {
                }
            } else {
                rationalI = i(size);
            }
            arrayList.add(size);
            map2.put(rationalI, size);
        }
        map.put(bniVar, arrayList);
        return arrayList;
    }

    public final List f(List list, boolean z) {
        int i;
        List arrayList;
        HashMap map = new HashMap();
        Rational rational = bno.a;
        map.put(rational, new ArrayList());
        Rational rational2 = bno.c;
        map.put(rational2, new ArrayList());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(rational);
        arrayList2.add(rational2);
        Iterator it = list.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            Size size = (Size) it.next();
            if (size.getHeight() > 0) {
                int size2 = arrayList2.size();
                while (true) {
                    if (i >= size2) {
                        arrayList = null;
                        break;
                    }
                    Rational rational3 = (Rational) arrayList2.get(i);
                    i++;
                    if (bno.a(size, rational3)) {
                        arrayList = (List) map.get(rational3);
                        break;
                    }
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    Rational rationalI = i(size);
                    arrayList2.add(rationalI);
                    map.put(rationalI, arrayList);
                }
                arrayList.add(size);
            }
        }
        ArrayList arrayList3 = new ArrayList(map.keySet());
        Collections.sort(arrayList3, new bvf(i(this.f)));
        ArrayList arrayList4 = new ArrayList();
        int size3 = arrayList3.size();
        while (i < size3) {
            Rational rational4 = (Rational) arrayList3.get(i);
            if (!rational4.equals(rational2) && !rational4.equals(rational)) {
                List list2 = (List) map.get(rational4);
                list2.getClass();
                arrayList4.addAll(g(rational4, list2, z));
            }
            i++;
        }
        return arrayList4;
    }

    public final List g(Rational rational, List list, boolean z) {
        ArrayList arrayList;
        ArrayList<Size> arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (bno.a(size, rational)) {
                arrayList2.add(size);
            }
        }
        Collections.sort(arrayList2, new bnv(true));
        HashSet hashSet = new HashSet(arrayList2);
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            List<Size> listE = e((bni) it2.next());
            if (!z) {
                ArrayList arrayList3 = new ArrayList();
                for (Size size2 : listE) {
                    if (!k(rational, size2)) {
                        arrayList3.add(size2);
                    }
                }
                listE = arrayList3;
            }
            if (listE.isEmpty()) {
                return new ArrayList();
            }
            if (listE.isEmpty() || arrayList2.isEmpty()) {
                arrayList2 = new ArrayList();
            } else {
                ArrayList arrayList4 = new ArrayList();
                for (Size size3 : arrayList2) {
                    Iterator it3 = listE.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        if (!h((Size) it3.next(), size3)) {
                            arrayList4.add(size3);
                            break;
                        }
                    }
                }
                arrayList2 = arrayList4;
            }
            if (listE.isEmpty() || arrayList2.isEmpty()) {
                arrayList = new ArrayList();
            } else {
                ArrayList<Size> arrayList5 = arrayList2.isEmpty() ? arrayList2 : new ArrayList(new LinkedHashSet(arrayList2));
                arrayList = new ArrayList();
                for (Size size4 : arrayList5) {
                    Iterator it4 = listE.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            arrayList.add(size4);
                            break;
                        }
                        if (h((Size) it4.next(), size4)) {
                            break;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
            hashSet.retainAll(arrayList);
        }
        ArrayList arrayList6 = new ArrayList();
        for (Size size5 : arrayList2) {
            if (!hashSet.contains(size5)) {
                arrayList6.add(size5);
            }
        }
        return arrayList6;
    }
}
