package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amc implements biq {
    public final Context a;
    public final bdx b;
    public final bjf c;
    public final bje d;
    public final avp e;
    public final List f;
    public final aqs g;
    public final long h;
    private final Map i = new HashMap();
    private final brh j;

    public amc(Context context, bjf bjfVar, azg azgVar, long j, brh brhVar) throws bbq {
        this.a = context;
        this.c = bjfVar;
        avp avpVar = new avp(Build.VERSION.SDK_INT >= 30 ? new avs(context) : Build.VERSION.SDK_INT >= 29 ? new avr(context) : Build.VERSION.SDK_INT >= 28 ? new avq(context) : new avu(context, new avt(((bhc) bjfVar).b)));
        this.e = avpVar;
        this.g = aqs.d(context);
        try {
            ArrayList<String> arrayList = new ArrayList();
            List<String> listAsList = Arrays.asList(avpVar.a.f());
            if (azgVar == null) {
                Iterator it = listAsList.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
            } else {
                Object obj = null;
                try {
                    Integer numB = azgVar.b();
                    if (numB != null && listAsList.contains("0") && listAsList.contains("1")) {
                        if (numB.intValue() == 1) {
                            if (((Integer) avpVar.a("0").c(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                                obj = "1";
                            }
                        } else if (numB.intValue() == 0 && ((Integer) avpVar.a("1").c(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                            obj = "0";
                        }
                    }
                } catch (IllegalStateException unused) {
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : listAsList) {
                    if (!str.equals(obj)) {
                        arrayList2.add(a(str));
                    }
                }
                Iterator it2 = azgVar.c(arrayList2).iterator();
                while (it2.hasNext()) {
                    arrayList.add(((bir) ((azd) it2.next())).l());
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (String str2 : arrayList) {
                if (str2.equals("0") || str2.equals("1")) {
                    arrayList3.add(str2);
                } else if (apy.a(this.e, str2)) {
                    arrayList3.add(str2);
                } else {
                    bbs.a("Camera2CameraFactory", a.a(str2, "Camera ", " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE."));
                }
            }
            this.f = arrayList3;
            axw axwVar = new axw(this.e);
            this.b = axwVar;
            bje bjeVar = new bje(axwVar);
            this.d = bjeVar;
            axwVar.a.add(bjeVar);
            this.h = j;
            this.j = brhVar;
        } catch (aub e) {
            throw new bbq(new azj(e));
        } catch (azj e2) {
            throw new bbq(e2);
        }
    }

    public final ann a(String str) throws azj {
        try {
            Map map = this.i;
            ann annVar = (ann) map.get(str);
            if (annVar != null) {
                return annVar;
            }
            ann annVar2 = new ann(str, this.e);
            map.put(str, annVar2);
            return annVar2;
        } catch (aub e) {
            throw new azj(e);
        }
    }

    @Override // defpackage.biq
    public final Set b() {
        return new LinkedHashSet(this.f);
    }
}
