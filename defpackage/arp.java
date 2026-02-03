package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.Size;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class arp {
    public final auy a;
    private final fctc c = fctd.a(new fdae() { // from class: arl
        @Override // defpackage.fdae
        public final Object invoke() {
            int[] iArr = (int[]) this.a.a.c(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            boolean z = false;
            if (iArr != null) {
                int i = 0;
                while (true) {
                    if (i >= iArr.length) {
                        break;
                    }
                    if (iArr[i] == 9) {
                        z = true;
                        break;
                    }
                    i++;
                }
            }
            return Boolean.valueOf(z);
        }
    });
    public final fctc b = fctd.a(new fdae() { // from class: arm
        @Override // defpackage.fdae
        public final Object invoke() {
            List listB = this.a.b();
            if (true == listB.isEmpty()) {
                listB = null;
            }
            if (listB == null) {
                return null;
            }
            Iterator it = listB.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            Object next = it.next();
            if (it.hasNext()) {
                int iA = bsd.a((Size) next);
                while (true) {
                    Object next2 = it.next();
                    int iA2 = bsd.a((Size) next2);
                    int i = iA < iA2 ? iA2 : iA;
                    if (iA < iA2) {
                        next = next2;
                    }
                    if (!it.hasNext()) {
                        break;
                    }
                    iA = i;
                }
            }
            return (Size) next;
        }
    });
    private final fctc d = fctd.a(new fdae() { // from class: arn
        @Override // defpackage.fdae
        public final Object invoke() {
            Size[] highSpeedVideoSizes = this.a.a.b().b.a.getHighSpeedVideoSizes();
            return highSpeedVideoSizes != null ? fcur.K(highSpeedVideoSizes) : fcvo.a;
        }
    });

    public arp(auy auyVar) {
        this.a = auyVar;
    }

    public static final List d(List list) {
        if (list.isEmpty()) {
            return fcvo.a;
        }
        List listAq = fcva.aq((Collection) fcva.N(list));
        Iterator it = fcva.ac(list, 1).iterator();
        while (it.hasNext()) {
            listAq.retainAll((List) it.next());
        }
        return listAq;
    }

    public final List a(Size size) {
        Object objA;
        try {
            objA = this.a.b().b(size);
        } catch (Throwable th) {
            objA = fctl.a(th);
        }
        if (true == (objA instanceof fctj)) {
            objA = null;
        }
        Range[] rangeArr = (Range[]) objA;
        return rangeArr != null ? fcva.ao(fcur.K(rangeArr)) : fcvo.a;
    }

    public final List b() {
        return (List) this.d.a();
    }

    public final boolean c() {
        return ((Boolean) this.c.a()).booleanValue();
    }
}
