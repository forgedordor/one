package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asj {
    bmw a;
    List b;
    private final List c = new ArrayList();
    private final List d = new ArrayList();
    private final List e = new ArrayList();
    private final List f = new ArrayList();
    private final List g = new ArrayList();
    private final Map h;
    private final List i;
    private final List j;
    private final List k;
    private final String l;
    private final ali m;
    private final auy n;
    private final axa o;
    private final int p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private final aqs v;
    private final axo w;
    private final aqt x;
    private final arp y;

    public asj(Context context, String str, avp avpVar, ali aliVar) throws azj, NumberFormatException {
        List listSingletonList;
        long[] jArr;
        int[] iArr;
        int length;
        new ArrayList();
        this.h = new HashMap();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.q = false;
        this.r = false;
        this.s = false;
        this.t = false;
        this.u = false;
        this.b = new ArrayList();
        this.w = new axo();
        lcg.i(str);
        this.l = str;
        this.m = aliVar;
        this.o = new axa();
        this.v = aqs.d(context);
        try {
            auy auyVarA = avpVar.a(str);
            this.n = auyVarA;
            Integer num = (Integer) auyVarA.c(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.p = num != null ? num.intValue() : 2;
            int[] iArr2 = (int[]) auyVarA.c(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr2 != null) {
                for (int i : iArr2) {
                    if (i == 3) {
                        this.q = true;
                    } else if (i == 6) {
                        this.r = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && i == 16) {
                        this.u = true;
                    }
                }
            }
            aqt aqtVar = new aqt(this.n);
            this.x = aqtVar;
            this.y = new arp(this.n);
            List list = this.c;
            int i2 = this.p;
            boolean z = this.q;
            boolean z2 = this.r;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            bmt bmtVar = new bmt();
            bmu bmuVar = bmu.MAXIMUM;
            bmu[] bmuVarArr = bmv.b;
            bmtVar.b(new bhp(1, bmuVar, 0L));
            arrayList2.add(bmtVar);
            bmt bmtVar2 = new bmt();
            bmtVar2.b(new bhp(3, bmuVar, 0L));
            arrayList2.add(bmtVar2);
            bmt bmtVar3 = new bmt();
            bmtVar3.b(new bhp(2, bmuVar, 0L));
            arrayList2.add(bmtVar3);
            bmt bmtVar4 = new bmt();
            bmu bmuVar2 = bmu.PREVIEW;
            bmtVar4.b(new bhp(1, bmuVar2, 0L));
            bmtVar4.b(new bhp(3, bmuVar, 0L));
            arrayList2.add(bmtVar4);
            bmt bmtVar5 = new bmt();
            bmtVar5.b(new bhp(2, bmuVar2, 0L));
            bmtVar5.b(new bhp(3, bmuVar, 0L));
            arrayList2.add(bmtVar5);
            bmt bmtVar6 = new bmt();
            bmtVar6.b(new bhp(1, bmuVar2, 0L));
            bmtVar6.b(new bhp(1, bmuVar2, 0L));
            arrayList2.add(bmtVar6);
            bmt bmtVar7 = new bmt();
            bmtVar7.b(new bhp(1, bmuVar2, 0L));
            bmtVar7.b(new bhp(2, bmuVar2, 0L));
            arrayList2.add(bmtVar7);
            bmt bmtVar8 = new bmt();
            bmtVar8.b(new bhp(1, bmuVar2, 0L));
            bmtVar8.b(new bhp(2, bmuVar2, 0L));
            int i3 = 3;
            bmtVar8.b(new bhp(3, bmuVar, 0L));
            arrayList2.add(bmtVar8);
            arrayList.addAll(arrayList2);
            if (i2 == 0 || i2 == 4 || i2 == 1) {
                ArrayList arrayList3 = new ArrayList();
                bmt bmtVar9 = new bmt();
                bmtVar9.b(new bhp(1, bmuVar2, 0L));
                bmu bmuVar3 = bmu.RECORD;
                bmtVar9.b(new bhp(1, bmuVar3, 0L));
                arrayList3.add(bmtVar9);
                bmt bmtVar10 = new bmt();
                bmtVar10.b(new bhp(1, bmuVar2, 0L));
                bmtVar10.b(new bhp(2, bmuVar3, 0L));
                arrayList3.add(bmtVar10);
                bmt bmtVar11 = new bmt();
                bmtVar11.b(new bhp(2, bmuVar2, 0L));
                bmtVar11.b(new bhp(2, bmuVar3, 0L));
                arrayList3.add(bmtVar11);
                bmt bmtVar12 = new bmt();
                bmtVar12.b(new bhp(1, bmuVar2, 0L));
                bmtVar12.b(new bhp(1, bmuVar3, 0L));
                bmtVar12.b(new bhp(3, bmuVar3, 0L));
                arrayList3.add(bmtVar12);
                bmt bmtVar13 = new bmt();
                bmtVar13.b(new bhp(1, bmuVar2, 0L));
                bmtVar13.b(new bhp(2, bmuVar3, 0L));
                bmtVar13.b(new bhp(3, bmuVar3, 0L));
                arrayList3.add(bmtVar13);
                bmt bmtVar14 = new bmt();
                bmtVar14.b(new bhp(2, bmuVar2, 0L));
                bmtVar14.b(new bhp(2, bmuVar2, 0L));
                i3 = 3;
                bmtVar14.b(new bhp(3, bmuVar, 0L));
                arrayList3.add(bmtVar14);
                arrayList.addAll(arrayList3);
            } else if (i2 == 3) {
                i2 = 3;
                ArrayList arrayList32 = new ArrayList();
                bmt bmtVar92 = new bmt();
                bmtVar92.b(new bhp(1, bmuVar2, 0L));
                bmu bmuVar32 = bmu.RECORD;
                bmtVar92.b(new bhp(1, bmuVar32, 0L));
                arrayList32.add(bmtVar92);
                bmt bmtVar102 = new bmt();
                bmtVar102.b(new bhp(1, bmuVar2, 0L));
                bmtVar102.b(new bhp(2, bmuVar32, 0L));
                arrayList32.add(bmtVar102);
                bmt bmtVar112 = new bmt();
                bmtVar112.b(new bhp(2, bmuVar2, 0L));
                bmtVar112.b(new bhp(2, bmuVar32, 0L));
                arrayList32.add(bmtVar112);
                bmt bmtVar122 = new bmt();
                bmtVar122.b(new bhp(1, bmuVar2, 0L));
                bmtVar122.b(new bhp(1, bmuVar32, 0L));
                bmtVar122.b(new bhp(3, bmuVar32, 0L));
                arrayList32.add(bmtVar122);
                bmt bmtVar132 = new bmt();
                bmtVar132.b(new bhp(1, bmuVar2, 0L));
                bmtVar132.b(new bhp(2, bmuVar32, 0L));
                bmtVar132.b(new bhp(3, bmuVar32, 0L));
                arrayList32.add(bmtVar132);
                bmt bmtVar142 = new bmt();
                bmtVar142.b(new bhp(2, bmuVar2, 0L));
                bmtVar142.b(new bhp(2, bmuVar2, 0L));
                i3 = 3;
                bmtVar142.b(new bhp(3, bmuVar, 0L));
                arrayList32.add(bmtVar142);
                arrayList.addAll(arrayList32);
            }
            if (i2 == 1) {
                ArrayList arrayList4 = new ArrayList();
                bmt bmtVar15 = new bmt();
                bmtVar15.b(new bhp(1, bmuVar2, 0L));
                bmtVar15.b(new bhp(1, bmuVar, 0L));
                arrayList4.add(bmtVar15);
                bmt bmtVar16 = new bmt();
                bmtVar16.b(new bhp(1, bmuVar2, 0L));
                bmtVar16.b(new bhp(2, bmuVar, 0L));
                arrayList4.add(bmtVar16);
                bmt bmtVar17 = new bmt();
                bmtVar17.b(new bhp(2, bmuVar2, 0L));
                bmtVar17.b(new bhp(2, bmuVar, 0L));
                arrayList4.add(bmtVar17);
                bmt bmtVar18 = new bmt();
                bmtVar18.b(new bhp(1, bmuVar2, 0L));
                bmtVar18.b(new bhp(1, bmuVar2, 0L));
                bmtVar18.b(new bhp(3, bmuVar, 0L));
                arrayList4.add(bmtVar18);
                bmt bmtVar19 = new bmt();
                bmu bmuVar4 = bmu.VGA;
                bmtVar19.b(new bhp(2, bmuVar4, 0L));
                bmtVar19.b(new bhp(1, bmuVar2, 0L));
                bmtVar19.b(new bhp(2, bmuVar, 0L));
                arrayList4.add(bmtVar19);
                bmt bmtVar20 = new bmt();
                bmtVar20.b(new bhp(2, bmuVar4, 0L));
                bmtVar20.b(new bhp(2, bmuVar2, 0L));
                bmtVar20.b(new bhp(2, bmuVar, 0L));
                arrayList4.add(bmtVar20);
                arrayList.addAll(arrayList4);
            } else if (i2 == i3) {
                i2 = 3;
                ArrayList arrayList42 = new ArrayList();
                bmt bmtVar152 = new bmt();
                bmtVar152.b(new bhp(1, bmuVar2, 0L));
                bmtVar152.b(new bhp(1, bmuVar, 0L));
                arrayList42.add(bmtVar152);
                bmt bmtVar162 = new bmt();
                bmtVar162.b(new bhp(1, bmuVar2, 0L));
                bmtVar162.b(new bhp(2, bmuVar, 0L));
                arrayList42.add(bmtVar162);
                bmt bmtVar172 = new bmt();
                bmtVar172.b(new bhp(2, bmuVar2, 0L));
                bmtVar172.b(new bhp(2, bmuVar, 0L));
                arrayList42.add(bmtVar172);
                bmt bmtVar182 = new bmt();
                bmtVar182.b(new bhp(1, bmuVar2, 0L));
                bmtVar182.b(new bhp(1, bmuVar2, 0L));
                bmtVar182.b(new bhp(3, bmuVar, 0L));
                arrayList42.add(bmtVar182);
                bmt bmtVar192 = new bmt();
                bmu bmuVar42 = bmu.VGA;
                bmtVar192.b(new bhp(2, bmuVar42, 0L));
                bmtVar192.b(new bhp(1, bmuVar2, 0L));
                bmtVar192.b(new bhp(2, bmuVar, 0L));
                arrayList42.add(bmtVar192);
                bmt bmtVar202 = new bmt();
                bmtVar202.b(new bhp(2, bmuVar42, 0L));
                bmtVar202.b(new bhp(2, bmuVar2, 0L));
                bmtVar202.b(new bhp(2, bmuVar, 0L));
                arrayList42.add(bmtVar202);
                arrayList.addAll(arrayList42);
            }
            if (z) {
                ArrayList arrayList5 = new ArrayList();
                bmt bmtVar21 = new bmt();
                bmtVar21.b(new bhp(5, bmuVar, 0L));
                arrayList5.add(bmtVar21);
                bmt bmtVar22 = new bmt();
                bmtVar22.b(new bhp(1, bmuVar2, 0L));
                bmtVar22.b(new bhp(5, bmuVar, 0L));
                arrayList5.add(bmtVar22);
                bmt bmtVar23 = new bmt();
                bmtVar23.b(new bhp(2, bmuVar2, 0L));
                bmtVar23.b(new bhp(5, bmuVar, 0L));
                arrayList5.add(bmtVar23);
                bmt bmtVar24 = new bmt();
                bmtVar24.b(new bhp(1, bmuVar2, 0L));
                bmtVar24.b(new bhp(1, bmuVar2, 0L));
                bmtVar24.b(new bhp(5, bmuVar, 0L));
                arrayList5.add(bmtVar24);
                bmt bmtVar25 = new bmt();
                bmtVar25.b(new bhp(1, bmuVar2, 0L));
                bmtVar25.b(new bhp(2, bmuVar2, 0L));
                bmtVar25.b(new bhp(5, bmuVar, 0L));
                arrayList5.add(bmtVar25);
                bmt bmtVar26 = new bmt();
                bmtVar26.b(new bhp(2, bmuVar2, 0L));
                bmtVar26.b(new bhp(2, bmuVar2, 0L));
                bmtVar26.b(new bhp(5, bmuVar, 0L));
                arrayList5.add(bmtVar26);
                bmt bmtVar27 = new bmt();
                bmtVar27.b(new bhp(1, bmuVar2, 0L));
                bmtVar27.b(new bhp(3, bmuVar, 0L));
                bmtVar27.b(new bhp(5, bmuVar, 0L));
                arrayList5.add(bmtVar27);
                bmt bmtVar28 = new bmt();
                bmtVar28.b(new bhp(2, bmuVar2, 0L));
                bmtVar28.b(new bhp(3, bmuVar, 0L));
                bmtVar28.b(new bhp(5, bmuVar, 0L));
                arrayList5.add(bmtVar28);
                arrayList.addAll(arrayList5);
            }
            if (z2 && i2 == 0) {
                ArrayList arrayList6 = new ArrayList();
                bmt bmtVar29 = new bmt();
                bmtVar29.b(new bhp(1, bmuVar2, 0L));
                bmtVar29.b(new bhp(1, bmuVar, 0L));
                arrayList6.add(bmtVar29);
                bmt bmtVar30 = new bmt();
                bmtVar30.b(new bhp(1, bmuVar2, 0L));
                bmtVar30.b(new bhp(2, bmuVar, 0L));
                arrayList6.add(bmtVar30);
                bmt bmtVar31 = new bmt();
                bmtVar31.b(new bhp(2, bmuVar2, 0L));
                bmtVar31.b(new bhp(2, bmuVar, 0L));
                arrayList6.add(bmtVar31);
                arrayList.addAll(arrayList6);
            }
            if (i2 == 3) {
                ArrayList arrayList7 = new ArrayList();
                bmt bmtVar32 = new bmt();
                bmtVar32.b(new bhp(1, bmuVar2, 0L));
                bmu bmuVar5 = bmu.VGA;
                bmtVar32.b(new bhp(1, bmuVar5, 0L));
                bmtVar32.b(new bhp(2, bmuVar, 0L));
                bmtVar32.b(new bhp(5, bmuVar, 0L));
                arrayList7.add(bmtVar32);
                bmt bmtVar33 = new bmt();
                bmtVar33.b(new bhp(1, bmuVar2, 0L));
                bmtVar33.b(new bhp(1, bmuVar5, 0L));
                bmtVar33.b(new bhp(3, bmuVar, 0L));
                bmtVar33.b(new bhp(5, bmuVar, 0L));
                arrayList7.add(bmtVar33);
                arrayList.addAll(arrayList7);
            }
            list.addAll(arrayList);
            List list2 = this.c;
            axa axaVar = this.o;
            String str2 = this.l;
            if (axaVar.a == null) {
                listSingletonList = new ArrayList();
            } else if (ExtraSupportedSurfaceCombinationsQuirk.a()) {
                listSingletonList = new ArrayList();
                if (str2.equals("1")) {
                    listSingletonList.add(ExtraSupportedSurfaceCombinationsQuirk.a);
                }
            } else {
                listSingletonList = (ExtraSupportedSurfaceCombinationsQuirk.b() || ExtraSupportedSurfaceCombinationsQuirk.c()) ? Collections.singletonList(ExtraSupportedSurfaceCombinationsQuirk.b) : Collections.EMPTY_LIST;
            }
            list2.addAll(listSingletonList);
            if (this.u) {
                List list3 = this.d;
                ArrayList arrayList8 = new ArrayList();
                bmt bmtVar34 = new bmt();
                bmu bmuVar6 = bmu.ULTRA_MAXIMUM;
                bmtVar34.b(new bhp(2, bmuVar6, 0L));
                bmtVar34.b(new bhp(1, bmuVar2, 0L));
                bmu bmuVar7 = bmu.RECORD;
                bmtVar34.b(new bhp(1, bmuVar7, 0L));
                arrayList8.add(bmtVar34);
                bmt bmtVar35 = new bmt();
                bmtVar35.b(new bhp(3, bmuVar6, 0L));
                bmtVar35.b(new bhp(1, bmuVar2, 0L));
                bmtVar35.b(new bhp(1, bmuVar7, 0L));
                arrayList8.add(bmtVar35);
                bmt bmtVar36 = new bmt();
                bmtVar36.b(new bhp(5, bmuVar6, 0L));
                bmtVar36.b(new bhp(1, bmuVar2, 0L));
                bmtVar36.b(new bhp(1, bmuVar7, 0L));
                arrayList8.add(bmtVar36);
                bmt bmtVar37 = new bmt();
                bmtVar37.b(new bhp(2, bmuVar6, 0L));
                bmtVar37.b(new bhp(1, bmuVar2, 0L));
                bmtVar37.b(new bhp(3, bmuVar, 0L));
                arrayList8.add(bmtVar37);
                bmt bmtVar38 = new bmt();
                bmtVar38.b(new bhp(3, bmuVar6, 0L));
                bmtVar38.b(new bhp(1, bmuVar2, 0L));
                bmtVar38.b(new bhp(3, bmuVar, 0L));
                arrayList8.add(bmtVar38);
                bmt bmtVar39 = new bmt();
                bmtVar39.b(new bhp(5, bmuVar6, 0L));
                bmtVar39.b(new bhp(1, bmuVar2, 0L));
                bmtVar39.b(new bhp(3, bmuVar, 0L));
                arrayList8.add(bmtVar39);
                bmt bmtVar40 = new bmt();
                bmtVar40.b(new bhp(2, bmuVar6, 0L));
                bmtVar40.b(new bhp(1, bmuVar2, 0L));
                bmtVar40.b(new bhp(2, bmuVar, 0L));
                arrayList8.add(bmtVar40);
                bmt bmtVar41 = new bmt();
                bmtVar41.b(new bhp(3, bmuVar6, 0L));
                bmtVar41.b(new bhp(1, bmuVar2, 0L));
                bmtVar41.b(new bhp(2, bmuVar, 0L));
                arrayList8.add(bmtVar41);
                bmt bmtVar42 = new bmt();
                bmtVar42.b(new bhp(5, bmuVar6, 0L));
                bmtVar42.b(new bhp(1, bmuVar2, 0L));
                bmtVar42.b(new bhp(2, bmuVar, 0L));
                arrayList8.add(bmtVar42);
                bmt bmtVar43 = new bmt();
                bmtVar43.b(new bhp(2, bmuVar6, 0L));
                bmtVar43.b(new bhp(1, bmuVar2, 0L));
                bmtVar43.b(new bhp(5, bmuVar, 0L));
                arrayList8.add(bmtVar43);
                bmt bmtVar44 = new bmt();
                bmtVar44.b(new bhp(3, bmuVar6, 0L));
                bmtVar44.b(new bhp(1, bmuVar2, 0L));
                bmtVar44.b(new bhp(5, bmuVar, 0L));
                arrayList8.add(bmtVar44);
                bmt bmtVar45 = new bmt();
                bmtVar45.b(new bhp(5, bmuVar6, 0L));
                bmtVar45.b(new bhp(1, bmuVar2, 0L));
                bmtVar45.b(new bhp(5, bmuVar, 0L));
                arrayList8.add(bmtVar45);
                list3.addAll(arrayList8);
            }
            boolean zHasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.s = zHasSystemFeature;
            if (zHasSystemFeature) {
                List list4 = this.e;
                ArrayList arrayList9 = new ArrayList();
                bmt bmtVar46 = new bmt();
                bmu bmuVar8 = bmu.S1440P_4_3;
                bmtVar46.b(new bhp(2, bmuVar8, 0L));
                arrayList9.add(bmtVar46);
                bmt bmtVar47 = new bmt();
                bmtVar47.b(new bhp(1, bmuVar8, 0L));
                arrayList9.add(bmtVar47);
                bmt bmtVar48 = new bmt();
                bmtVar48.b(new bhp(3, bmuVar8, 0L));
                arrayList9.add(bmtVar48);
                bmt bmtVar49 = new bmt();
                bmu bmuVar9 = bmu.S720P_16_9;
                bmtVar49.b(new bhp(2, bmuVar9, 0L));
                bmtVar49.b(new bhp(3, bmuVar8, 0L));
                arrayList9.add(bmtVar49);
                bmt bmtVar50 = new bmt();
                bmtVar50.b(new bhp(1, bmuVar9, 0L));
                bmtVar50.b(new bhp(3, bmuVar8, 0L));
                arrayList9.add(bmtVar50);
                bmt bmtVar51 = new bmt();
                bmtVar51.b(new bhp(2, bmuVar9, 0L));
                bmtVar51.b(new bhp(2, bmuVar8, 0L));
                arrayList9.add(bmtVar51);
                bmt bmtVar52 = new bmt();
                bmtVar52.b(new bhp(2, bmuVar9, 0L));
                bmtVar52.b(new bhp(1, bmuVar8, 0L));
                arrayList9.add(bmtVar52);
                bmt bmtVar53 = new bmt();
                bmtVar53.b(new bhp(1, bmuVar9, 0L));
                bmtVar53.b(new bhp(2, bmuVar8, 0L));
                arrayList9.add(bmtVar53);
                bmt bmtVar54 = new bmt();
                bmtVar54.b(new bhp(1, bmuVar9, 0L));
                bmtVar54.b(new bhp(1, bmuVar8, 0L));
                arrayList9.add(bmtVar54);
                list4.addAll(arrayList9);
            }
            if (aqtVar.c) {
                List list5 = this.i;
                ArrayList arrayList10 = new ArrayList();
                bmt bmtVar55 = new bmt();
                bmtVar55.b(new bhp(1, bmuVar, 0L));
                arrayList10.add(bmtVar55);
                bmt bmtVar56 = new bmt();
                bmtVar56.b(new bhp(2, bmuVar, 0L));
                arrayList10.add(bmtVar56);
                bmt bmtVar57 = new bmt();
                bmtVar57.b(new bhp(1, bmuVar2, 0L));
                bmtVar57.b(new bhp(3, bmuVar, 0L));
                arrayList10.add(bmtVar57);
                bmt bmtVar58 = new bmt();
                bmtVar58.b(new bhp(1, bmuVar2, 0L));
                bmtVar58.b(new bhp(2, bmuVar, 0L));
                arrayList10.add(bmtVar58);
                bmt bmtVar59 = new bmt();
                bmtVar59.b(new bhp(2, bmuVar2, 0L));
                bmtVar59.b(new bhp(2, bmuVar, 0L));
                arrayList10.add(bmtVar59);
                bmt bmtVar60 = new bmt();
                bmtVar60.b(new bhp(1, bmuVar2, 0L));
                bmu bmuVar10 = bmu.RECORD;
                bmtVar60.b(new bhp(1, bmuVar10, 0L));
                arrayList10.add(bmtVar60);
                bmt bmtVar61 = new bmt();
                bmtVar61.b(new bhp(1, bmuVar2, 0L));
                bmtVar61.b(new bhp(1, bmuVar10, 0L));
                bmtVar61.b(new bhp(2, bmuVar10, 0L));
                arrayList10.add(bmtVar61);
                bmt bmtVar62 = new bmt();
                bmtVar62.b(new bhp(1, bmuVar2, 0L));
                bmtVar62.b(new bhp(1, bmuVar10, 0L));
                bmtVar62.b(new bhp(3, bmuVar10, 0L));
                arrayList10.add(bmtVar62);
                list5.addAll(arrayList10);
            }
            auy auyVar = this.n;
            bjo bjoVar = ash.a;
            boolean z3 = (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) auyVar.c(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) ? false : true;
            this.t = z3;
            if (z3 && Build.VERSION.SDK_INT >= 33) {
                List list6 = this.k;
                ArrayList arrayList11 = new ArrayList();
                bmt bmtVar63 = new bmt();
                bmu bmuVar11 = bmu.S1440P_4_3;
                bmtVar63.b(new bhp(1, bmuVar11, 4L));
                arrayList11.add(bmtVar63);
                bmt bmtVar64 = new bmt();
                bmtVar64.b(new bhp(2, bmuVar11, 4L));
                arrayList11.add(bmtVar64);
                bmt bmtVar65 = new bmt();
                bmu bmuVar12 = bmu.RECORD;
                bmtVar65.b(new bhp(1, bmuVar12, 3L));
                arrayList11.add(bmtVar65);
                bmt bmtVar66 = new bmt();
                bmtVar66.b(new bhp(2, bmuVar12, 3L));
                arrayList11.add(bmtVar66);
                bmt bmtVar67 = new bmt();
                bmtVar67.b(new bhp(3, bmuVar, 2L));
                arrayList11.add(bmtVar67);
                bmt bmtVar68 = new bmt();
                bmtVar68.b(new bhp(2, bmuVar, 2L));
                arrayList11.add(bmtVar68);
                bmt bmtVar69 = new bmt();
                bmtVar69.b(new bhp(1, bmuVar2, 1L));
                bmtVar69.b(new bhp(3, bmuVar, 2L));
                arrayList11.add(bmtVar69);
                bmt bmtVar70 = new bmt();
                bmtVar70.b(new bhp(1, bmuVar2, 1L));
                bmtVar70.b(new bhp(2, bmuVar, 2L));
                arrayList11.add(bmtVar70);
                bmt bmtVar71 = new bmt();
                bmtVar71.b(new bhp(1, bmuVar2, 1L));
                bmtVar71.b(new bhp(1, bmuVar12, 3L));
                arrayList11.add(bmtVar71);
                bmt bmtVar72 = new bmt();
                bmtVar72.b(new bhp(1, bmuVar2, 1L));
                bmtVar72.b(new bhp(2, bmuVar12, 3L));
                arrayList11.add(bmtVar72);
                bmt bmtVar73 = new bmt();
                bmtVar73.b(new bhp(1, bmuVar2, 1L));
                bmtVar73.b(new bhp(2, bmuVar2, 1L));
                arrayList11.add(bmtVar73);
                bmt bmtVar74 = new bmt();
                bmtVar74.b(new bhp(1, bmuVar2, 1L));
                bmtVar74.b(new bhp(1, bmuVar12, 3L));
                bmtVar74.b(new bhp(3, bmuVar12, 2L));
                arrayList11.add(bmtVar74);
                bmt bmtVar75 = new bmt();
                bmtVar75.b(new bhp(1, bmuVar2, 1L));
                bmtVar75.b(new bhp(2, bmuVar12, 3L));
                bmtVar75.b(new bhp(3, bmuVar12, 2L));
                arrayList11.add(bmtVar75);
                bmt bmtVar76 = new bmt();
                bmtVar76.b(new bhp(1, bmuVar2, 1L));
                bmtVar76.b(new bhp(2, bmuVar2, 1L));
                bmtVar76.b(new bhp(3, bmuVar, 2L));
                arrayList11.add(bmtVar76);
                list6.addAll(arrayList11);
            }
            auy auyVar2 = this.n;
            if (Build.VERSION.SDK_INT >= 33 && (iArr = (int[]) auyVar2.c(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) != null && (length = iArr.length) != 0) {
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    if (iArr[i4] != 2) {
                        i4++;
                    } else if (Build.VERSION.SDK_INT >= 33) {
                        List list7 = this.f;
                        ArrayList arrayList12 = new ArrayList();
                        bmt bmtVar77 = new bmt();
                        bmu bmuVar13 = bmu.S1440P_4_3;
                        bmtVar77.b(new bhp(1, bmuVar13, 0L));
                        arrayList12.add(bmtVar77);
                        bmt bmtVar78 = new bmt();
                        bmtVar78.b(new bhp(2, bmuVar13, 0L));
                        arrayList12.add(bmtVar78);
                        bmt bmtVar79 = new bmt();
                        bmtVar79.b(new bhp(1, bmuVar13, 0L));
                        bmtVar79.b(new bhp(3, bmuVar, 0L));
                        arrayList12.add(bmtVar79);
                        bmt bmtVar80 = new bmt();
                        bmtVar80.b(new bhp(2, bmuVar13, 0L));
                        bmtVar80.b(new bhp(3, bmuVar, 0L));
                        arrayList12.add(bmtVar80);
                        bmt bmtVar81 = new bmt();
                        bmtVar81.b(new bhp(1, bmuVar13, 0L));
                        bmtVar81.b(new bhp(2, bmuVar, 0L));
                        arrayList12.add(bmtVar81);
                        bmt bmtVar82 = new bmt();
                        bmtVar82.b(new bhp(2, bmuVar13, 0L));
                        bmtVar82.b(new bhp(2, bmuVar, 0L));
                        arrayList12.add(bmtVar82);
                        bmt bmtVar83 = new bmt();
                        bmtVar83.b(new bhp(1, bmuVar2, 0L));
                        bmtVar83.b(new bhp(1, bmuVar13, 0L));
                        arrayList12.add(bmtVar83);
                        bmt bmtVar84 = new bmt();
                        bmtVar84.b(new bhp(2, bmuVar2, 0L));
                        bmtVar84.b(new bhp(1, bmuVar13, 0L));
                        arrayList12.add(bmtVar84);
                        bmt bmtVar85 = new bmt();
                        bmtVar85.b(new bhp(1, bmuVar2, 0L));
                        bmtVar85.b(new bhp(2, bmuVar13, 0L));
                        arrayList12.add(bmtVar85);
                        bmt bmtVar86 = new bmt();
                        bmtVar86.b(new bhp(2, bmuVar2, 0L));
                        bmtVar86.b(new bhp(2, bmuVar13, 0L));
                        arrayList12.add(bmtVar86);
                        list7.addAll(arrayList12);
                    }
                }
            }
            l();
        } catch (aub e) {
            throw new azj(e);
        }
    }

    private final int f(int i, Size size, boolean z) {
        boolean z2;
        if (!z) {
            z2 = true;
        } else if (i == 34) {
            i = 34;
            z2 = true;
        } else {
            z2 = false;
        }
        lcg.c(z2);
        if (!z) {
            try {
                return (int) (1.0E9d / ((StreamConfigurationMap) this.n.c(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(i, size));
            } catch (Exception unused) {
                return 0;
            }
        }
        arp arpVar = this.y;
        size.getClass();
        List listA = arpVar.a(size);
        if (true == listA.isEmpty()) {
            listA = null;
        }
        if (listA == null) {
            Objects.toString(size);
            bbs.f("HighSpeedResolver", "No supported high speed  fps for ".concat(size.toString()));
            return 0;
        }
        Iterator it = listA.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Integer num = (Integer) ((Range) it.next()).getUpper();
        while (it.hasNext()) {
            Integer num2 = (Integer) ((Range) it.next()).getUpper();
            if (num.compareTo(num2) < 0) {
                num = num2;
            }
        }
        num.getClass();
        return num.intValue();
    }

    private static int g(Range range, Range range2) {
        boolean z = false;
        if (!range.contains((Range) range2.getUpper()) && !range.contains((Range) range2.getLower())) {
            z = true;
        }
        lcg.d(z, "Ranges must not intersect");
        return ((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue() ? ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue() : ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    private static int h(Range range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    private final int i(int i, int i2, Size size, boolean z) {
        return Math.min(i, f(i2, size, z));
    }

    private final Pair j(asi asiVar, List list, List list2, List list3, List list4, int i, Map map, Map map2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bha bhaVar = (bha) it.next();
            arrayList.add(bhaVar.h());
            if (map != null) {
                map.put(Integer.valueOf(arrayList.size() - 1), bhaVar);
            }
        }
        for (int i2 = 0; i2 < list2.size(); i2++) {
            Size size = (Size) list2.get(i2);
            bni bniVar = (bni) list3.get(((Integer) list4.get(i2)).intValue());
            int iA = bniVar.a();
            arrayList.add(bmv.e(iA, size, a(iA), 2));
            if (map2 != null) {
                map2.put(Integer.valueOf(arrayList.size() - 1), bniVar);
            }
            i = i(i, bniVar.a(), size, ((alh) asiVar).e);
        }
        return new Pair(arrayList, Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x086b  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x08a0  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0921  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0928  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x042c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v67, types: [fcvo] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r31v0, types: [asj] */
    /* JADX WARN: Type inference failed for: r34v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r37v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v51, types: [bjq, bma] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.HashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v17, types: [bjq, bma] */
    /* JADX WARN: Type inference failed for: r5v35, types: [bjq, bma] */
    /* JADX WARN: Type inference failed for: r5v41, types: [bjq, bma] */
    /* JADX WARN: Type inference failed for: r7v18, types: [bmr] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.util.Pair k(defpackage.asi r32, java.util.List r33, java.util.Map r34, java.util.List r35, java.util.List r36, java.util.Map r37) {
        /*
            Method dump skipped, instructions count: 2568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asj.k(asi, java.util.List, java.util.Map, java.util.List, java.util.List, java.util.Map):android.util.Pair");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        r2 = new android.util.Size(r7.videoFrameWidth, r7.videoFrameHeight);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void l() throws java.lang.NumberFormatException {
        /*
            r10 = this;
            aqs r0 = r10.v
            android.util.Size r4 = r0.b()
            r0 = 0
            r1 = 0
            java.lang.String r2 = r10.l     // Catch: java.lang.NumberFormatException -> L39
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L39
            r3 = 8
            int[] r5 = new int[r3]     // Catch: java.lang.NumberFormatException -> L39
            r5 = {x009c: FILL_ARRAY_DATA , data: [1, 13, 10, 8, 12, 6, 5, 4} // fill-array     // Catch: java.lang.NumberFormatException -> L39
            r6 = r0
        L16:
            if (r6 >= r3) goto L35
            r7 = r5[r6]     // Catch: java.lang.NumberFormatException -> L39
            ali r8 = r10.m     // Catch: java.lang.NumberFormatException -> L39
            boolean r9 = r8.b(r2, r7)     // Catch: java.lang.NumberFormatException -> L39
            if (r9 == 0) goto L32
            android.media.CamcorderProfile r7 = r8.a(r2, r7)     // Catch: java.lang.NumberFormatException -> L39
            if (r7 == 0) goto L32
            android.util.Size r2 = new android.util.Size     // Catch: java.lang.NumberFormatException -> L39
            int r3 = r7.videoFrameWidth     // Catch: java.lang.NumberFormatException -> L39
            int r5 = r7.videoFrameHeight     // Catch: java.lang.NumberFormatException -> L39
            r2.<init>(r3, r5)     // Catch: java.lang.NumberFormatException -> L39
            goto L36
        L32:
            int r6 = r6 + 1
            goto L16
        L35:
            r2 = r1
        L36:
            if (r2 == 0) goto L39
            goto L7b
        L39:
            auy r2 = r10.n
            avv r2 = r2.b()
            android.hardware.camera2.params.StreamConfigurationMap r2 = r2.a()     // Catch: java.lang.Throwable -> L4a
            java.lang.Class<android.media.MediaRecorder> r3 = android.media.MediaRecorder.class
            android.util.Size[] r2 = r2.getOutputSizes(r3)     // Catch: java.lang.Throwable -> L4a
            goto L4b
        L4a:
            r2 = r1
        L4b:
            if (r2 != 0) goto L4e
            goto L77
        L4e:
            bnv r3 = new bnv
            r5 = 1
            r3.<init>(r5)
            java.util.Arrays.sort(r2, r3)
        L57:
            int r3 = r2.length
            if (r0 >= r3) goto L77
            r3 = r2[r0]
            int r5 = r3.getWidth()
            android.util.Size r6 = defpackage.bsd.f
            int r7 = r6.getWidth()
            if (r5 > r7) goto L74
            int r5 = r3.getHeight()
            int r6 = r6.getHeight()
            if (r5 > r6) goto L74
            r1 = r3
            goto L77
        L74:
            int r0 = r0 + 1
            goto L57
        L77:
            if (r1 != 0) goto L7d
            android.util.Size r2 = defpackage.bsd.d
        L7b:
            r6 = r2
            goto L7e
        L7d:
            r6 = r1
        L7e:
            android.util.Size r2 = defpackage.bsd.c
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            bhq r1 = new bhq
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r10.a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asj.l():void");
    }

    private final void m(Map map, Size size, int i) {
        if (this.s) {
            Size sizeN = n(this.n.b().a(), i, false);
            Integer numValueOf = Integer.valueOf(i);
            if (sizeN != null) {
                size = (Size) Collections.min(Arrays.asList(size, sizeN), new bnv());
            }
            map.put(numValueOf, size);
        }
    }

    private static final Size n(StreamConfigurationMap streamConfigurationMap, int i, boolean z) {
        Size[] outputSizes;
        Size[] highResolutionOutputSizes;
        try {
            outputSizes = i == 34 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(i);
        } catch (Throwable unused) {
            outputSizes = null;
        }
        if (outputSizes == null || outputSizes.length == 0) {
            return null;
        }
        bnv bnvVar = new bnv();
        Size size = (Size) Collections.max(Arrays.asList(outputSizes), bnvVar);
        Size size2 = bsd.a;
        if (z && (highResolutionOutputSizes = streamConfigurationMap.getHighResolutionOutputSizes(i)) != null && highResolutionOutputSizes.length > 0) {
            size2 = (Size) Collections.max(Arrays.asList(highResolutionOutputSizes), bnvVar);
        }
        return (Size) Collections.max(Arrays.asList(size, size2), bnvVar);
    }

    private static final Range o(Range range, Range range2) {
        if (range2 == null) {
            return range;
        }
        if (range != null) {
            try {
                return range2.intersect(range);
            } catch (IllegalArgumentException unused) {
            }
        }
        return range2;
    }

    final bmw a(int i) {
        StreamConfigurationMap streamConfigurationMap;
        List list = this.b;
        Integer numValueOf = Integer.valueOf(i);
        if (!list.contains(numValueOf)) {
            m(((bhq) this.a).b, bsd.e, i);
            m(((bhq) this.a).d, bsd.g, i);
            Map map = ((bhq) this.a).f;
            auy auyVar = this.n;
            Size sizeN = n(auyVar.b().a(), i, true);
            if (sizeN != null) {
                map.put(numValueOf, sizeN);
            }
            Map map2 = ((bhq) this.a).g;
            if (Build.VERSION.SDK_INT >= 31 && this.u && (streamConfigurationMap = (StreamConfigurationMap) auyVar.c(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) != null) {
                map2.put(numValueOf, n(streamConfigurationMap, i, true));
            }
            this.b.add(numValueOf);
        }
        return this.a;
    }

    final List b(asi asiVar, List list) {
        bjo bjoVar = ash.a;
        if (((alh) asiVar).b != 8) {
            return null;
        }
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            List listA = ((bmt) it.next()).a(list);
            if (listA != null) {
                return listA;
            }
        }
        return null;
    }

    final boolean c(asi asiVar, List list) {
        List list2;
        Map map = this.h;
        if (map.containsKey(asiVar)) {
            list2 = (List) map.get(asiVar);
        } else {
            ArrayList arrayList = new ArrayList();
            alh alhVar = (alh) asiVar;
            if (alhVar.d) {
                List list3 = this.j;
                if (list3.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    bmt bmtVar = new bmt();
                    bmu bmuVar = bmu.MAXIMUM;
                    bmu[] bmuVarArr = bmv.b;
                    bmtVar.b(new bhp(4, bmuVar, 0L));
                    arrayList2.add(bmtVar);
                    bmt bmtVar2 = new bmt();
                    bmtVar2.b(new bhp(1, bmu.PREVIEW, 0L));
                    bmtVar2.b(new bhp(4, bmuVar, 0L));
                    arrayList2.add(bmtVar2);
                    list3.addAll(arrayList2);
                }
                arrayList.addAll(list3);
            } else if (alhVar.e) {
                List list4 = this.g;
                if (list4.isEmpty()) {
                    arp arpVar = this.y;
                    if (arpVar.c()) {
                        list4.clear();
                        Size size = (Size) arpVar.b.a();
                        if (size != null) {
                            bmw bmwVarA = a(34);
                            ArrayList arrayList3 = new ArrayList();
                            bmv bmvVarE = bmv.e(34, size, bmwVarA, 2);
                            bmt bmtVar3 = new bmt();
                            bmtVar3.b(bmvVarE);
                            arrayList3.add(bmtVar3);
                            bmt bmtVar4 = new bmt();
                            bmtVar4.b(bmvVarE);
                            bmtVar4.b(bmvVarE);
                            arrayList3.add(bmtVar4);
                            list4.addAll(arrayList3);
                        }
                    }
                }
                arrayList.addAll(list4);
            } else {
                int i = alhVar.b;
                if (i == 8) {
                    arrayList.addAll(alhVar.c ? this.f : this.c);
                } else if (i == 10) {
                    arrayList.addAll(this.i);
                }
            }
            map.put(asiVar, arrayList);
            list2 = arrayList;
        }
        Iterator it = list2.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z = ((bmt) it.next()).a(list) != null;
            if (z) {
                break;
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0261  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair d(java.util.List r33, java.util.Map r34, boolean r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 1302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asj.d(java.util.List, java.util.Map, boolean, boolean):android.util.Pair");
    }

    public final bmv e(int i, Size size) {
        return bmv.e(i, size, a(i), 2);
    }
}
