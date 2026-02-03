package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.sun.jna.Function;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ktp {
    public static final int[] a = {0, 4, 8};
    private static final SparseIntArray c;
    private static final SparseIntArray d;
    private final HashMap e = new HashMap();
    public final HashMap b = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        c = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        d = sparseIntArray2;
        int[] iArr = ktt.a;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(EnergyProfile.EVCONNECTOR_TYPE_OTHER, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(EnergyProfile.EVCONNECTOR_TYPE_OTHER, 86);
        sparseIntArray2.append(94, 97);
    }

    public static int a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void l(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ktp.l(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    static void m(kte kteVar, String str) throws NumberFormatException {
        int i;
        int i2 = -1;
        float fAbs = Float.NaN;
        if (str != null) {
            int iIndexOf = str.indexOf(44);
            int length = str.length();
            if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                i = -1;
            } else {
                String strSubstring = str.substring(0, iIndexOf);
                i = iIndexOf + 1;
                i = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
            }
            int iIndexOf2 = str.indexOf(58);
            if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                String strSubstring2 = str.substring(i);
                if (strSubstring2.length() > 0) {
                    fAbs = Float.parseFloat(strSubstring2);
                }
                i2 = i;
            } else {
                String strSubstring3 = str.substring(i, iIndexOf2);
                String strSubstring4 = str.substring(iIndexOf2 + 1);
                if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                    float f = Float.parseFloat(strSubstring3);
                    float f2 = Float.parseFloat(strSubstring4);
                    if (f > 0.0f && f2 > 0.0f) {
                        fAbs = i == 1 ? Math.abs(f2 / f) : Math.abs(f / f2);
                    }
                }
                i2 = i;
            }
        }
        kteVar.I = str;
        kteVar.J = fAbs;
        kteVar.K = i2;
    }

    private static final int[] o(View view, String str) throws IllegalAccessException, IllegalArgumentException {
        int length;
        int iIntValue;
        Object objD;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            length = strArrSplit.length;
            if (i >= length) {
                break;
            }
            String strTrim = strArrSplit[i].trim();
            try {
                iIntValue = kts.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0) {
                iIntValue = (view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objD = ((ConstraintLayout) view.getParent()).d(strTrim)) != null && (objD instanceof Integer)) ? ((Integer) objD).intValue() : 0;
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    private static final ktk p(Context context, AttributeSet attributeSet, boolean z) throws NumberFormatException {
        String str;
        String str2;
        int i;
        ktk ktkVar = new ktk();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? ktt.c : ktt.a);
        String str3 = "unused attribute 0x";
        int i2 = 0;
        if (z) {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            ktj ktjVar = new ktj();
            ktkVar.g = ktjVar;
            ktm ktmVar = ktkVar.c;
            ktmVar.b = false;
            ktl ktlVar = ktkVar.d;
            ktlVar.c = false;
            ktn ktnVar = ktkVar.b;
            ktnVar.a = false;
            kto ktoVar = ktkVar.e;
            ktoVar.b = false;
            while (i2 < indexCount) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                int i3 = i2;
                switch (d.get(index)) {
                    case 2:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ktlVar.K));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        str2 = str3;
                        i = indexCount;
                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + c.get(index));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 5:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.c(5, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 6:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, ktlVar.E));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 7:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, ktlVar.F));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 8:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ktlVar.L));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 11:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ktlVar.R));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 12:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ktlVar.S));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 13:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ktlVar.O));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 14:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ktlVar.Q));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 15:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ktlVar.T));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 16:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ktlVar.P));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 17:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, ktlVar.f));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 18:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, ktlVar.g));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 19:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.a(19, typedArrayObtainStyledAttributes.getFloat(index, ktlVar.h));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 20:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.a(20, typedArrayObtainStyledAttributes.getFloat(index, ktlVar.y));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 21:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, ktlVar.e));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 22:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.b(22, a[typedArrayObtainStyledAttributes.getInt(index, ktnVar.b)]);
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 23:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, ktlVar.d));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 24:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ktlVar.H));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 27:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.b(27, typedArrayObtainStyledAttributes.getInt(index, ktlVar.G));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 28:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ktlVar.I));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 31:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ktlVar.M));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 34:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ktlVar.J));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 37:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.a(37, typedArrayObtainStyledAttributes.getFloat(index, ktlVar.z));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 38:
                        str2 = str3;
                        i = indexCount;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, ktkVar.a);
                        ktkVar.a = resourceId;
                        ktjVar.b(38, resourceId);
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case Maneuver.TYPE_DESTINATION /* 39 */:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.a(39, typedArrayObtainStyledAttributes.getFloat(index, ktlVar.W));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 40:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.a(40, typedArrayObtainStyledAttributes.getFloat(index, ktlVar.V));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 41:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.b(41, typedArrayObtainStyledAttributes.getInt(index, ktlVar.X));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 42:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.b(42, typedArrayObtainStyledAttributes.getInt(index, ktlVar.Y));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 43:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.a(43, typedArrayObtainStyledAttributes.getFloat(index, ktnVar.d));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 44:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.d(44, true);
                        ktjVar.a(44, typedArrayObtainStyledAttributes.getDimension(index, ktoVar.o));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 45:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.a(45, typedArrayObtainStyledAttributes.getFloat(index, ktoVar.d));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 46:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.a(46, typedArrayObtainStyledAttributes.getFloat(index, ktoVar.e));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 47:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.a(47, typedArrayObtainStyledAttributes.getFloat(index, ktoVar.f));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 48:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.a(48, typedArrayObtainStyledAttributes.getFloat(index, ktoVar.g));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.a(49, typedArrayObtainStyledAttributes.getDimension(index, ktoVar.h));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 50:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.a(50, typedArrayObtainStyledAttributes.getDimension(index, ktoVar.i));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 51:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.a(51, typedArrayObtainStyledAttributes.getDimension(index, ktoVar.k));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 52:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.a(52, typedArrayObtainStyledAttributes.getDimension(index, ktoVar.l));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 53:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.a(53, typedArrayObtainStyledAttributes.getDimension(index, ktoVar.m));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 54:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.b(54, typedArrayObtainStyledAttributes.getInt(index, ktlVar.Z));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 55:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.b(55, typedArrayObtainStyledAttributes.getInt(index, ktlVar.aa));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 56:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ktlVar.ab));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 57:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ktlVar.ac));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 58:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ktlVar.ad));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 59:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ktlVar.ae));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 60:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.a(60, typedArrayObtainStyledAttributes.getFloat(index, ktoVar.c));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 62:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ktlVar.C));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case Function.ALT_CONVENTION /* 63 */:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.a(63, typedArrayObtainStyledAttributes.getFloat(index, ktlVar.D));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 64:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.b(64, a(typedArrayObtainStyledAttributes, index, ktmVar.c));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 65:
                        str2 = str3;
                        i = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            ktjVar.c(65, typedArrayObtainStyledAttributes.getString(index));
                            continue;
                        } else {
                            ktjVar.c(65, kql.a[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        }
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 66:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 67:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.a(67, typedArrayObtainStyledAttributes.getFloat(index, ktmVar.j));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 68:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.a(68, typedArrayObtainStyledAttributes.getFloat(index, ktnVar.e));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 69:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.a(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 70:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.a(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 71:
                        str2 = str3;
                        i = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 72:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.b(72, typedArrayObtainStyledAttributes.getInt(index, ktlVar.ah));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 73:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ktlVar.ai));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 74:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.c(74, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 75:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.d(75, typedArrayObtainStyledAttributes.getBoolean(index, ktlVar.ap));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 76:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.b(76, typedArrayObtainStyledAttributes.getInt(index, ktmVar.f));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 77:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.c(77, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 78:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.b(78, typedArrayObtainStyledAttributes.getInt(index, ktnVar.c));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 79:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.a(79, typedArrayObtainStyledAttributes.getFloat(index, ktmVar.h));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.d(80, typedArrayObtainStyledAttributes.getBoolean(index, ktlVar.an));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 81:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.d(81, typedArrayObtainStyledAttributes.getBoolean(index, ktlVar.ao));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 82:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.b(82, typedArrayObtainStyledAttributes.getInteger(index, ktmVar.d));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 83:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.b(83, a(typedArrayObtainStyledAttributes, index, ktoVar.j));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 84:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.b(84, typedArrayObtainStyledAttributes.getInteger(index, ktmVar.l));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 85:
                        str2 = str3;
                        i = indexCount;
                        ktjVar.a(85, typedArrayObtainStyledAttributes.getFloat(index, ktmVar.k));
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 86:
                        i = indexCount;
                        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(index);
                        str2 = str3;
                        if (typedValuePeekValue.type == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            ktmVar.n = resourceId2;
                            ktjVar.b(89, resourceId2);
                            if (ktmVar.n != -1) {
                                ktjVar.b(88, -2);
                            } else {
                                continue;
                            }
                        } else if (typedValuePeekValue.type == 3) {
                            ktmVar.m = typedArrayObtainStyledAttributes.getString(index);
                            ktjVar.c(90, ktmVar.m);
                            if (ktmVar.m.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                ktmVar.n = resourceId3;
                                ktjVar.b(89, resourceId3);
                                ktjVar.b(88, -2);
                            } else {
                                ktjVar.b(88, -1);
                            }
                        } else {
                            ktjVar.b(88, typedArrayObtainStyledAttributes.getInteger(index, ktmVar.n));
                        }
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                    case 87:
                        i = indexCount;
                        Log.w("ConstraintSet", str3 + Integer.toHexString(index) + "   " + c.get(index));
                        break;
                    case 93:
                        i = indexCount;
                        ktjVar.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ktlVar.N));
                        break;
                    case 94:
                        i = indexCount;
                        ktjVar.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, ktlVar.U));
                        break;
                    case 95:
                        i = indexCount;
                        l(ktjVar, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                        i = indexCount;
                        l(ktjVar, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i = indexCount;
                        ktjVar.b(97, typedArrayObtainStyledAttributes.getInt(index, ktlVar.aq));
                        break;
                    case 98:
                        i = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type != 3) {
                            ktkVar.a = typedArrayObtainStyledAttributes.getResourceId(index, ktkVar.a);
                            break;
                        } else {
                            typedArrayObtainStyledAttributes.getString(index);
                            break;
                        }
                    case 99:
                        ktjVar.d(99, typedArrayObtainStyledAttributes.getBoolean(index, ktlVar.i));
                        str2 = str3;
                        i = indexCount;
                        continue;
                        i2 = i3 + 1;
                        indexCount = i;
                        str3 = str2;
                }
                str2 = str3;
                i2 = i3 + 1;
                indexCount = i;
                str3 = str2;
            }
        } else {
            String str4 = "unused attribute 0x";
            int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount();
            int i4 = 0;
            while (i4 < indexCount2) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index2 != 1 && index2 != 23 && index2 != 24) {
                    ktkVar.c.b = true;
                    ktkVar.d.c = true;
                    ktkVar.b.a = true;
                    ktkVar.e.b = true;
                }
                SparseIntArray sparseIntArray = c;
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        str = str4;
                        ktl ktlVar2 = ktkVar.d;
                        ktlVar2.r = a(typedArrayObtainStyledAttributes, index2, ktlVar2.r);
                        break;
                    case 2:
                        str = str4;
                        ktl ktlVar3 = ktkVar.d;
                        ktlVar3.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ktlVar3.K);
                        break;
                    case 3:
                        str = str4;
                        ktl ktlVar4 = ktkVar.d;
                        ktlVar4.q = a(typedArrayObtainStyledAttributes, index2, ktlVar4.q);
                        break;
                    case 4:
                        str = str4;
                        ktl ktlVar5 = ktkVar.d;
                        ktlVar5.p = a(typedArrayObtainStyledAttributes, index2, ktlVar5.p);
                        break;
                    case 5:
                        str = str4;
                        ktkVar.d.A = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 6:
                        str = str4;
                        ktl ktlVar6 = ktkVar.d;
                        ktlVar6.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, ktlVar6.E);
                        break;
                    case 7:
                        str = str4;
                        ktl ktlVar7 = ktkVar.d;
                        ktlVar7.F = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, ktlVar7.F);
                        break;
                    case 8:
                        str = str4;
                        ktl ktlVar8 = ktkVar.d;
                        ktlVar8.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ktlVar8.L);
                        break;
                    case 9:
                        str = str4;
                        ktl ktlVar9 = ktkVar.d;
                        ktlVar9.x = a(typedArrayObtainStyledAttributes, index2, ktlVar9.x);
                        break;
                    case 10:
                        str = str4;
                        ktl ktlVar10 = ktkVar.d;
                        ktlVar10.w = a(typedArrayObtainStyledAttributes, index2, ktlVar10.w);
                        break;
                    case 11:
                        str = str4;
                        ktl ktlVar11 = ktkVar.d;
                        ktlVar11.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ktlVar11.R);
                        break;
                    case 12:
                        str = str4;
                        ktl ktlVar12 = ktkVar.d;
                        ktlVar12.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ktlVar12.S);
                        break;
                    case 13:
                        str = str4;
                        ktl ktlVar13 = ktkVar.d;
                        ktlVar13.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ktlVar13.O);
                        break;
                    case 14:
                        str = str4;
                        ktl ktlVar14 = ktkVar.d;
                        ktlVar14.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ktlVar14.Q);
                        break;
                    case 15:
                        str = str4;
                        ktl ktlVar15 = ktkVar.d;
                        ktlVar15.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ktlVar15.T);
                        break;
                    case 16:
                        str = str4;
                        ktl ktlVar16 = ktkVar.d;
                        ktlVar16.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ktlVar16.P);
                        break;
                    case 17:
                        str = str4;
                        ktl ktlVar17 = ktkVar.d;
                        ktlVar17.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, ktlVar17.f);
                        break;
                    case 18:
                        str = str4;
                        ktl ktlVar18 = ktkVar.d;
                        ktlVar18.g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, ktlVar18.g);
                        break;
                    case 19:
                        str = str4;
                        ktl ktlVar19 = ktkVar.d;
                        ktlVar19.h = typedArrayObtainStyledAttributes.getFloat(index2, ktlVar19.h);
                        break;
                    case 20:
                        str = str4;
                        ktl ktlVar20 = ktkVar.d;
                        ktlVar20.y = typedArrayObtainStyledAttributes.getFloat(index2, ktlVar20.y);
                        break;
                    case 21:
                        str = str4;
                        ktl ktlVar21 = ktkVar.d;
                        ktlVar21.e = typedArrayObtainStyledAttributes.getLayoutDimension(index2, ktlVar21.e);
                        break;
                    case 22:
                        str = str4;
                        ktn ktnVar2 = ktkVar.b;
                        int i5 = typedArrayObtainStyledAttributes.getInt(index2, ktnVar2.b);
                        ktnVar2.b = i5;
                        ktnVar2.b = a[i5];
                        break;
                    case 23:
                        str = str4;
                        ktl ktlVar22 = ktkVar.d;
                        ktlVar22.d = typedArrayObtainStyledAttributes.getLayoutDimension(index2, ktlVar22.d);
                        break;
                    case 24:
                        str = str4;
                        ktl ktlVar23 = ktkVar.d;
                        ktlVar23.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ktlVar23.H);
                        break;
                    case 25:
                        str = str4;
                        ktl ktlVar24 = ktkVar.d;
                        ktlVar24.j = a(typedArrayObtainStyledAttributes, index2, ktlVar24.j);
                        break;
                    case 26:
                        str = str4;
                        ktl ktlVar25 = ktkVar.d;
                        ktlVar25.k = a(typedArrayObtainStyledAttributes, index2, ktlVar25.k);
                        break;
                    case 27:
                        str = str4;
                        ktl ktlVar26 = ktkVar.d;
                        ktlVar26.G = typedArrayObtainStyledAttributes.getInt(index2, ktlVar26.G);
                        break;
                    case 28:
                        str = str4;
                        ktl ktlVar27 = ktkVar.d;
                        ktlVar27.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ktlVar27.I);
                        break;
                    case 29:
                        str = str4;
                        ktl ktlVar28 = ktkVar.d;
                        ktlVar28.l = a(typedArrayObtainStyledAttributes, index2, ktlVar28.l);
                        break;
                    case 30:
                        str = str4;
                        ktl ktlVar29 = ktkVar.d;
                        ktlVar29.m = a(typedArrayObtainStyledAttributes, index2, ktlVar29.m);
                        break;
                    case 31:
                        str = str4;
                        ktl ktlVar30 = ktkVar.d;
                        ktlVar30.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ktlVar30.M);
                        break;
                    case 32:
                        str = str4;
                        ktl ktlVar31 = ktkVar.d;
                        ktlVar31.u = a(typedArrayObtainStyledAttributes, index2, ktlVar31.u);
                        break;
                    case 33:
                        str = str4;
                        ktl ktlVar32 = ktkVar.d;
                        ktlVar32.v = a(typedArrayObtainStyledAttributes, index2, ktlVar32.v);
                        break;
                    case 34:
                        str = str4;
                        ktl ktlVar33 = ktkVar.d;
                        ktlVar33.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ktlVar33.J);
                        break;
                    case 35:
                        str = str4;
                        ktl ktlVar34 = ktkVar.d;
                        ktlVar34.o = a(typedArrayObtainStyledAttributes, index2, ktlVar34.o);
                        break;
                    case 36:
                        str = str4;
                        ktl ktlVar35 = ktkVar.d;
                        ktlVar35.n = a(typedArrayObtainStyledAttributes, index2, ktlVar35.n);
                        break;
                    case 37:
                        str = str4;
                        ktl ktlVar36 = ktkVar.d;
                        ktlVar36.z = typedArrayObtainStyledAttributes.getFloat(index2, ktlVar36.z);
                        break;
                    case 38:
                        str = str4;
                        ktkVar.a = typedArrayObtainStyledAttributes.getResourceId(index2, ktkVar.a);
                        break;
                    case Maneuver.TYPE_DESTINATION /* 39 */:
                        str = str4;
                        ktl ktlVar37 = ktkVar.d;
                        ktlVar37.W = typedArrayObtainStyledAttributes.getFloat(index2, ktlVar37.W);
                        break;
                    case 40:
                        str = str4;
                        ktl ktlVar38 = ktkVar.d;
                        ktlVar38.V = typedArrayObtainStyledAttributes.getFloat(index2, ktlVar38.V);
                        break;
                    case 41:
                        str = str4;
                        ktl ktlVar39 = ktkVar.d;
                        ktlVar39.X = typedArrayObtainStyledAttributes.getInt(index2, ktlVar39.X);
                        break;
                    case 42:
                        str = str4;
                        ktl ktlVar40 = ktkVar.d;
                        ktlVar40.Y = typedArrayObtainStyledAttributes.getInt(index2, ktlVar40.Y);
                        break;
                    case 43:
                        str = str4;
                        ktn ktnVar3 = ktkVar.b;
                        ktnVar3.d = typedArrayObtainStyledAttributes.getFloat(index2, ktnVar3.d);
                        break;
                    case 44:
                        str = str4;
                        kto ktoVar2 = ktkVar.e;
                        ktoVar2.n = true;
                        ktoVar2.o = typedArrayObtainStyledAttributes.getDimension(index2, ktoVar2.o);
                        break;
                    case 45:
                        str = str4;
                        kto ktoVar3 = ktkVar.e;
                        ktoVar3.d = typedArrayObtainStyledAttributes.getFloat(index2, ktoVar3.d);
                        break;
                    case 46:
                        str = str4;
                        kto ktoVar4 = ktkVar.e;
                        ktoVar4.e = typedArrayObtainStyledAttributes.getFloat(index2, ktoVar4.e);
                        break;
                    case 47:
                        str = str4;
                        kto ktoVar5 = ktkVar.e;
                        ktoVar5.f = typedArrayObtainStyledAttributes.getFloat(index2, ktoVar5.f);
                        break;
                    case 48:
                        str = str4;
                        kto ktoVar6 = ktkVar.e;
                        ktoVar6.g = typedArrayObtainStyledAttributes.getFloat(index2, ktoVar6.g);
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                        str = str4;
                        kto ktoVar7 = ktkVar.e;
                        ktoVar7.h = typedArrayObtainStyledAttributes.getDimension(index2, ktoVar7.h);
                        break;
                    case 50:
                        str = str4;
                        kto ktoVar8 = ktkVar.e;
                        ktoVar8.i = typedArrayObtainStyledAttributes.getDimension(index2, ktoVar8.i);
                        break;
                    case 51:
                        str = str4;
                        kto ktoVar9 = ktkVar.e;
                        ktoVar9.k = typedArrayObtainStyledAttributes.getDimension(index2, ktoVar9.k);
                        break;
                    case 52:
                        str = str4;
                        kto ktoVar10 = ktkVar.e;
                        ktoVar10.l = typedArrayObtainStyledAttributes.getDimension(index2, ktoVar10.l);
                        break;
                    case 53:
                        str = str4;
                        kto ktoVar11 = ktkVar.e;
                        ktoVar11.m = typedArrayObtainStyledAttributes.getDimension(index2, ktoVar11.m);
                        break;
                    case 54:
                        str = str4;
                        ktl ktlVar41 = ktkVar.d;
                        ktlVar41.Z = typedArrayObtainStyledAttributes.getInt(index2, ktlVar41.Z);
                        break;
                    case 55:
                        str = str4;
                        ktl ktlVar42 = ktkVar.d;
                        ktlVar42.aa = typedArrayObtainStyledAttributes.getInt(index2, ktlVar42.aa);
                        break;
                    case 56:
                        str = str4;
                        ktl ktlVar43 = ktkVar.d;
                        ktlVar43.ab = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ktlVar43.ab);
                        break;
                    case 57:
                        str = str4;
                        ktl ktlVar44 = ktkVar.d;
                        ktlVar44.ac = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ktlVar44.ac);
                        break;
                    case 58:
                        str = str4;
                        ktl ktlVar45 = ktkVar.d;
                        ktlVar45.ad = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ktlVar45.ad);
                        break;
                    case 59:
                        str = str4;
                        ktl ktlVar46 = ktkVar.d;
                        ktlVar46.ae = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ktlVar46.ae);
                        break;
                    case 60:
                        str = str4;
                        kto ktoVar12 = ktkVar.e;
                        ktoVar12.c = typedArrayObtainStyledAttributes.getFloat(index2, ktoVar12.c);
                        break;
                    case 61:
                        str = str4;
                        ktl ktlVar47 = ktkVar.d;
                        ktlVar47.B = a(typedArrayObtainStyledAttributes, index2, ktlVar47.B);
                        break;
                    case 62:
                        str = str4;
                        ktl ktlVar48 = ktkVar.d;
                        ktlVar48.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ktlVar48.C);
                        break;
                    case Function.ALT_CONVENTION /* 63 */:
                        str = str4;
                        ktl ktlVar49 = ktkVar.d;
                        ktlVar49.D = typedArrayObtainStyledAttributes.getFloat(index2, ktlVar49.D);
                        break;
                    case 64:
                        str = str4;
                        ktm ktmVar2 = ktkVar.c;
                        ktmVar2.c = a(typedArrayObtainStyledAttributes, index2, ktmVar2.c);
                        break;
                    case 65:
                        str = str4;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type != 3) {
                            ktkVar.c.e = kql.a[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            break;
                        } else {
                            ktkVar.c.e = typedArrayObtainStyledAttributes.getString(index2);
                            break;
                        }
                    case 66:
                        str = str4;
                        ktkVar.c.g = typedArrayObtainStyledAttributes.getInt(index2, 0);
                        break;
                    case 67:
                        str = str4;
                        ktm ktmVar3 = ktkVar.c;
                        ktmVar3.j = typedArrayObtainStyledAttributes.getFloat(index2, ktmVar3.j);
                        break;
                    case 68:
                        str = str4;
                        ktn ktnVar4 = ktkVar.b;
                        ktnVar4.e = typedArrayObtainStyledAttributes.getFloat(index2, ktnVar4.e);
                        break;
                    case 69:
                        str = str4;
                        ktkVar.d.af = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        str = str4;
                        ktkVar.d.ag = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        str = str4;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        str = str4;
                        ktl ktlVar50 = ktkVar.d;
                        ktlVar50.ah = typedArrayObtainStyledAttributes.getInt(index2, ktlVar50.ah);
                        break;
                    case 73:
                        str = str4;
                        ktl ktlVar51 = ktkVar.d;
                        ktlVar51.ai = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ktlVar51.ai);
                        break;
                    case 74:
                        str = str4;
                        ktkVar.d.al = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        str = str4;
                        ktl ktlVar52 = ktkVar.d;
                        ktlVar52.ap = typedArrayObtainStyledAttributes.getBoolean(index2, ktlVar52.ap);
                        break;
                    case 76:
                        str = str4;
                        ktm ktmVar4 = ktkVar.c;
                        ktmVar4.f = typedArrayObtainStyledAttributes.getInt(index2, ktmVar4.f);
                        break;
                    case 77:
                        str = str4;
                        ktkVar.d.am = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        str = str4;
                        ktn ktnVar5 = ktkVar.b;
                        ktnVar5.c = typedArrayObtainStyledAttributes.getInt(index2, ktnVar5.c);
                        break;
                    case 79:
                        str = str4;
                        ktm ktmVar5 = ktkVar.c;
                        ktmVar5.h = typedArrayObtainStyledAttributes.getFloat(index2, ktmVar5.h);
                        break;
                    case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                        str = str4;
                        ktl ktlVar53 = ktkVar.d;
                        ktlVar53.an = typedArrayObtainStyledAttributes.getBoolean(index2, ktlVar53.an);
                        break;
                    case 81:
                        str = str4;
                        ktl ktlVar54 = ktkVar.d;
                        ktlVar54.ao = typedArrayObtainStyledAttributes.getBoolean(index2, ktlVar54.ao);
                        break;
                    case 82:
                        str = str4;
                        ktm ktmVar6 = ktkVar.c;
                        ktmVar6.d = typedArrayObtainStyledAttributes.getInteger(index2, ktmVar6.d);
                        break;
                    case 83:
                        str = str4;
                        kto ktoVar13 = ktkVar.e;
                        ktoVar13.j = a(typedArrayObtainStyledAttributes, index2, ktoVar13.j);
                        break;
                    case 84:
                        str = str4;
                        ktm ktmVar7 = ktkVar.c;
                        ktmVar7.l = typedArrayObtainStyledAttributes.getInteger(index2, ktmVar7.l);
                        break;
                    case 85:
                        str = str4;
                        ktm ktmVar8 = ktkVar.c;
                        ktmVar8.k = typedArrayObtainStyledAttributes.getFloat(index2, ktmVar8.k);
                        break;
                    case 86:
                        str = str4;
                        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(index2);
                        if (typedValuePeekValue2.type == 1) {
                            ktkVar.c.n = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (typedValuePeekValue2.type == 3) {
                            ktm ktmVar9 = ktkVar.c;
                            ktmVar9.m = typedArrayObtainStyledAttributes.getString(index2);
                            if (ktmVar9.m.indexOf("/") > 0) {
                                ktmVar9.n = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, ktkVar.c.n);
                        }
                        break;
                    case 87:
                        str = str4;
                        Log.w("ConstraintSet", str + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        str = str4;
                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 91:
                        ktl ktlVar55 = ktkVar.d;
                        ktlVar55.s = a(typedArrayObtainStyledAttributes, index2, ktlVar55.s);
                        str = str4;
                        break;
                    case 92:
                        ktl ktlVar56 = ktkVar.d;
                        ktlVar56.t = a(typedArrayObtainStyledAttributes, index2, ktlVar56.t);
                        str = str4;
                        break;
                    case 93:
                        ktl ktlVar57 = ktkVar.d;
                        ktlVar57.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ktlVar57.N);
                        str = str4;
                        break;
                    case 94:
                        ktl ktlVar58 = ktkVar.d;
                        ktlVar58.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, ktlVar58.U);
                        str = str4;
                        break;
                    case 95:
                        l(ktkVar.d, typedArrayObtainStyledAttributes, index2, 0);
                        str = str4;
                        break;
                    case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                        l(ktkVar.d, typedArrayObtainStyledAttributes, index2, 1);
                        str = str4;
                        break;
                    case 97:
                        ktl ktlVar59 = ktkVar.d;
                        ktlVar59.aq = typedArrayObtainStyledAttributes.getInt(index2, ktlVar59.aq);
                        str = str4;
                        break;
                }
                i4++;
                str4 = str;
            }
            ktl ktlVar60 = ktkVar.d;
            if (ktlVar60.al != null) {
                ktlVar60.ak = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return ktkVar;
    }

    private static final String q(int i) {
        return i != 3 ? i != 4 ? i != 5 ? i != 6 ? ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_END_TIME : ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME : "baseline" : "bottom" : "top";
    }

    public final ktk b(int i) {
        HashMap map = this.b;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            map.put(numValueOf, new ktk());
        }
        return (ktk) map.get(numValueOf);
    }

    public final void c(ConstraintLayout constraintLayout) {
        n(constraintLayout);
        constraintLayout.g = null;
        constraintLayout.requestLayout();
    }

    public final void d(ConstraintLayout constraintLayout) {
        int i;
        HashMap map;
        HashMap map2;
        ktp ktpVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map3 = ktpVar.b;
        map3.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            kte kteVar = (kte) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            Integer numValueOf = Integer.valueOf(id);
            if (!map3.containsKey(numValueOf)) {
                map3.put(numValueOf, new ktk());
            }
            ktk ktkVar = (ktk) map3.get(numValueOf);
            if (ktkVar == null) {
                i = childCount;
                map = map3;
            } else {
                HashMap map4 = ktpVar.e;
                HashMap map5 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : map4.keySet()) {
                    ktb ktbVar = (ktb) map4.get(str);
                    int i3 = childCount;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map2 = map3;
                            try {
                                map5.put(str, new ktb(ktbVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException e) {
                                e = e;
                                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                                childCount = i3;
                                map3 = map2;
                            } catch (NoSuchMethodException e2) {
                                e = e2;
                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                childCount = i3;
                                map3 = map2;
                            } catch (InvocationTargetException e3) {
                                e = e3;
                                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName(), e);
                                childCount = i3;
                                map3 = map2;
                            }
                        } else {
                            map2 = map3;
                            map5.put(str, new ktb(ktbVar, cls.getMethod(a.v(str, "getMap"), null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e4) {
                        e = e4;
                        map2 = map3;
                    } catch (NoSuchMethodException e5) {
                        e = e5;
                        map2 = map3;
                    } catch (InvocationTargetException e6) {
                        e = e6;
                        map2 = map3;
                    }
                    childCount = i3;
                    map3 = map2;
                }
                i = childCount;
                map = map3;
                ktkVar.f = map5;
                ktkVar.a = id;
                int i4 = kteVar.e;
                ktl ktlVar = ktkVar.d;
                ktlVar.j = i4;
                ktlVar.k = kteVar.f;
                ktlVar.l = kteVar.g;
                ktlVar.m = kteVar.h;
                ktlVar.n = kteVar.i;
                ktlVar.o = kteVar.j;
                ktlVar.p = kteVar.k;
                ktlVar.q = kteVar.l;
                ktlVar.r = kteVar.m;
                ktlVar.s = kteVar.n;
                ktlVar.t = kteVar.o;
                ktlVar.u = kteVar.s;
                ktlVar.v = kteVar.t;
                ktlVar.w = kteVar.u;
                ktlVar.x = kteVar.v;
                ktlVar.y = kteVar.G;
                ktlVar.z = kteVar.H;
                ktlVar.A = kteVar.I;
                ktlVar.B = kteVar.p;
                ktlVar.C = kteVar.q;
                ktlVar.D = kteVar.r;
                ktlVar.E = kteVar.X;
                ktlVar.F = kteVar.Y;
                ktlVar.G = kteVar.Z;
                ktlVar.h = kteVar.c;
                ktlVar.f = kteVar.a;
                ktlVar.g = kteVar.b;
                ktlVar.d = kteVar.width;
                ktlVar.e = kteVar.height;
                ktlVar.H = kteVar.leftMargin;
                ktlVar.I = kteVar.rightMargin;
                ktlVar.J = kteVar.topMargin;
                ktlVar.K = kteVar.bottomMargin;
                ktlVar.N = kteVar.D;
                ktlVar.V = kteVar.M;
                ktlVar.W = kteVar.L;
                ktlVar.Y = kteVar.O;
                ktlVar.X = kteVar.N;
                ktlVar.an = kteVar.aa;
                ktlVar.ao = kteVar.ab;
                ktlVar.Z = kteVar.P;
                ktlVar.aa = kteVar.Q;
                ktlVar.ab = kteVar.T;
                ktlVar.ac = kteVar.U;
                ktlVar.ad = kteVar.R;
                ktlVar.ae = kteVar.S;
                ktlVar.af = kteVar.V;
                ktlVar.ag = kteVar.W;
                ktlVar.am = kteVar.ac;
                ktlVar.P = kteVar.x;
                ktlVar.R = kteVar.z;
                ktlVar.O = kteVar.w;
                ktlVar.Q = kteVar.y;
                ktlVar.T = kteVar.A;
                ktlVar.S = kteVar.B;
                ktlVar.U = kteVar.C;
                ktlVar.aq = kteVar.ad;
                ktlVar.L = kteVar.getMarginEnd();
                ktlVar.M = kteVar.getMarginStart();
                ktn ktnVar = ktkVar.b;
                ktnVar.b = childAt.getVisibility();
                ktnVar.d = childAt.getAlpha();
                kto ktoVar = ktkVar.e;
                ktoVar.c = childAt.getRotation();
                ktoVar.d = childAt.getRotationX();
                ktoVar.e = childAt.getRotationY();
                ktoVar.f = childAt.getScaleX();
                ktoVar.g = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    ktoVar.h = pivotX;
                    ktoVar.i = pivotY;
                }
                ktoVar.k = childAt.getTranslationX();
                ktoVar.l = childAt.getTranslationY();
                ktoVar.m = childAt.getTranslationZ();
                if (ktoVar.n) {
                    ktoVar.o = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    ktlVar.ap = barrier.b.b;
                    ktlVar.ak = Arrays.copyOf(barrier.c, barrier.d);
                    ktlVar.ah = barrier.a;
                    ktlVar.ai = barrier.b.c;
                }
            }
            i2++;
            ktpVar = this;
            childCount = i;
            map3 = map;
        }
    }

    public final void e(Context context, int i) {
        d((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    public final void f(int i, int i2, int i3, int i4) {
        ktl ktlVar;
        HashMap map = this.b;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            map.put(numValueOf, new ktk());
        }
        ktk ktkVar = (ktk) map.get(numValueOf);
        if (ktkVar == null) {
            return;
        }
        if (i2 != 3) {
            ktlVar = ktkVar.d;
            if (i4 == 4) {
                ktlVar.q = i3;
                ktlVar.p = -1;
            } else {
                ktlVar.p = i3;
                ktlVar.q = -1;
            }
        } else {
            ktlVar = ktkVar.d;
            if (i4 == 3) {
                ktlVar.n = i3;
                ktlVar.o = -1;
            } else {
                ktlVar.o = i3;
                ktlVar.n = -1;
            }
        }
        ktlVar.r = -1;
        ktlVar.s = -1;
        ktlVar.t = -1;
    }

    public final void g(int i, int i2, int i3, int i4, int i5) {
        ktl ktlVar;
        HashMap map = this.b;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            map.put(numValueOf, new ktk());
        }
        ktk ktkVar = (ktk) map.get(numValueOf);
        if (ktkVar == null) {
            return;
        }
        if (i2 == 3) {
            if (i4 == 3) {
                ktlVar = ktkVar.d;
                ktlVar.n = i3;
                ktlVar.o = -1;
            } else {
                if (i4 != 4) {
                    throw new IllegalArgumentException("right to " + q(i4) + " undefined");
                }
                ktlVar = ktkVar.d;
                ktlVar.o = i3;
                ktlVar.n = -1;
            }
            ktlVar.r = -1;
            ktlVar.s = -1;
            ktlVar.t = -1;
            ktkVar.d.J = i5;
            return;
        }
        if (i2 == 4) {
            if (i4 == 4) {
                ktl ktlVar2 = ktkVar.d;
                ktlVar2.q = i3;
                ktlVar2.p = -1;
                ktlVar2.r = -1;
                ktlVar2.s = -1;
                ktlVar2.t = -1;
            } else {
                if (i4 != 3) {
                    throw new IllegalArgumentException("right to " + q(i4) + " undefined");
                }
                ktl ktlVar3 = ktkVar.d;
                ktlVar3.p = i3;
                ktlVar3.q = -1;
                ktlVar3.r = -1;
                ktlVar3.s = -1;
                ktlVar3.t = -1;
            }
            ktkVar.d.K = i5;
            return;
        }
        if (i2 == 5) {
            if (i4 == 5) {
                ktl ktlVar4 = ktkVar.d;
                ktlVar4.r = i3;
                ktlVar4.q = -1;
                ktlVar4.p = -1;
                ktlVar4.n = -1;
                ktlVar4.o = -1;
                return;
            }
            if (i4 == 3) {
                ktl ktlVar5 = ktkVar.d;
                ktlVar5.s = i3;
                ktlVar5.q = -1;
                ktlVar5.p = -1;
                ktlVar5.n = -1;
                ktlVar5.o = -1;
                return;
            }
            if (i4 != 4) {
                throw new IllegalArgumentException("right to " + q(i4) + " undefined");
            }
            ktl ktlVar6 = ktkVar.d;
            ktlVar6.t = i3;
            ktlVar6.q = -1;
            ktlVar6.p = -1;
            ktlVar6.n = -1;
            ktlVar6.o = -1;
            return;
        }
        if (i2 != 6) {
            if (i4 == 7) {
                ktl ktlVar7 = ktkVar.d;
                ktlVar7.x = i3;
                ktlVar7.w = -1;
            } else {
                if (i4 != 6) {
                    throw new IllegalArgumentException("right to " + q(i4) + " undefined");
                }
                ktl ktlVar8 = ktkVar.d;
                ktlVar8.w = i3;
                ktlVar8.x = -1;
            }
            ktkVar.d.L = i5;
            return;
        }
        if (i4 == 6) {
            ktl ktlVar9 = ktkVar.d;
            ktlVar9.v = i3;
            ktlVar9.u = -1;
        } else {
            if (i4 != 7) {
                throw new IllegalArgumentException("right to " + q(i4) + " undefined");
            }
            ktl ktlVar10 = ktkVar.d;
            ktlVar10.u = i3;
            ktlVar10.v = -1;
        }
        ktkVar.d.M = i5;
    }

    public final void h(int i, float f) {
        b(i).d.af = f;
    }

    public final void i(int i, int i2) {
        b(i).d.d = i2;
    }

    public final void j(Context context, int i) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    ktk ktkVarP = p(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        ktkVarP.d.b = true;
                    }
                    this.b.put(Integer.valueOf(ktkVarP.a), ktkVarP);
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", a.g(i, "Error parsing resource: "), e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", a.g(i, "Error parsing resource: "), e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(android.content.Context r21, org.xmlpull.v1.XmlPullParser r22) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 2208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ktp.k(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public final void n(ConstraintLayout constraintLayout) throws IllegalAccessException, NoSuchMethodException, Resources.NotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String resourceEntryName;
        HashMap map;
        HashSet hashSet;
        int i;
        HashSet hashSet2;
        String strConcat;
        int i2;
        int i3;
        int i4;
        HashMap map2 = this.b;
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet3 = new HashSet(map2.keySet());
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = constraintLayout.getChildAt(i5);
            int id = childAt.getId();
            Integer numValueOf = Integer.valueOf(id);
            if (!map2.containsKey(numValueOf)) {
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                Log.w("ConstraintSet", "id unknown ".concat(String.valueOf(resourceEntryName)));
            } else {
                if (id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    HashMap map3 = this.b;
                    if (map3.containsKey(numValueOf)) {
                        hashSet3.remove(numValueOf);
                        ktk ktkVar = (ktk) map3.get(numValueOf);
                        if (ktkVar != null) {
                            if (childAt instanceof Barrier) {
                                ktl ktlVar = ktkVar.d;
                                ktlVar.aj = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.a = ktlVar.ah;
                                barrier.b(ktlVar.ai);
                                barrier.b.b = ktlVar.ap;
                                int[] iArr = ktlVar.ak;
                                if (iArr != null) {
                                    barrier.j(iArr);
                                } else {
                                    String str = ktlVar.al;
                                    if (str != null) {
                                        ktlVar.ak = o(barrier, str);
                                        barrier.j(ktlVar.ak);
                                    }
                                }
                            }
                            kte kteVar = (kte) childAt.getLayoutParams();
                            kteVar.a();
                            ktkVar.a(kteVar);
                            HashMap map4 = ktkVar.f;
                            Class<?> cls = childAt.getClass();
                            for (String str2 : map4.keySet()) {
                                ktb ktbVar = (ktb) map4.get(str2);
                                HashMap map5 = map2;
                                if (ktbVar.a) {
                                    hashSet2 = hashSet3;
                                    strConcat = str2;
                                } else {
                                    hashSet2 = hashSet3;
                                    strConcat = "set".concat(String.valueOf(str2));
                                }
                                try {
                                    i3 = ktbVar.h;
                                    i4 = i3 - 1;
                                } catch (IllegalAccessException e) {
                                    e = e;
                                    i2 = i5;
                                } catch (NoSuchMethodException e2) {
                                    e = e2;
                                    i2 = i5;
                                } catch (InvocationTargetException e3) {
                                    e = e3;
                                    i2 = i5;
                                }
                                if (i3 == 0) {
                                    i2 = i5;
                                    throw null;
                                }
                                switch (i4) {
                                    case 0:
                                        i2 = i5;
                                        cls.getMethod(strConcat, Integer.TYPE).invoke(childAt, Integer.valueOf(ktbVar.c));
                                        map2 = map5;
                                        hashSet3 = hashSet2;
                                        i5 = i2;
                                        break;
                                    case 1:
                                        i2 = i5;
                                        cls.getMethod(strConcat, Float.TYPE).invoke(childAt, Float.valueOf(ktbVar.d));
                                        map2 = map5;
                                        hashSet3 = hashSet2;
                                        i5 = i2;
                                        break;
                                    case 2:
                                        i2 = i5;
                                        cls.getMethod(strConcat, Integer.TYPE).invoke(childAt, Integer.valueOf(ktbVar.g));
                                        map2 = map5;
                                        hashSet3 = hashSet2;
                                        i5 = i2;
                                        break;
                                    case 3:
                                        i2 = i5;
                                        Method method = cls.getMethod(strConcat, Drawable.class);
                                        ColorDrawable colorDrawable = new ColorDrawable();
                                        colorDrawable.setColor(ktbVar.g);
                                        method.invoke(childAt, colorDrawable);
                                        map2 = map5;
                                        hashSet3 = hashSet2;
                                        i5 = i2;
                                        break;
                                    case 4:
                                        i2 = i5;
                                        cls.getMethod(strConcat, CharSequence.class).invoke(childAt, ktbVar.e);
                                        map2 = map5;
                                        hashSet3 = hashSet2;
                                        i5 = i2;
                                        break;
                                    case 5:
                                        i2 = i5;
                                        cls.getMethod(strConcat, Boolean.TYPE).invoke(childAt, Boolean.valueOf(ktbVar.f));
                                        map2 = map5;
                                        hashSet3 = hashSet2;
                                        i5 = i2;
                                        break;
                                    case 6:
                                        i2 = i5;
                                        cls.getMethod(strConcat, Float.TYPE).invoke(childAt, Float.valueOf(ktbVar.d));
                                        map2 = map5;
                                        hashSet3 = hashSet2;
                                        i5 = i2;
                                        break;
                                    case 7:
                                        i2 = i5;
                                        try {
                                            cls.getMethod(strConcat, Integer.TYPE).invoke(childAt, Integer.valueOf(ktbVar.c));
                                        } catch (IllegalAccessException e4) {
                                            e = e4;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e);
                                            map2 = map5;
                                            hashSet3 = hashSet2;
                                            i5 = i2;
                                        } catch (NoSuchMethodException e5) {
                                            e = e5;
                                            Log.e("TransitionLayout", cls.getName() + " must have a method " + strConcat, e);
                                            map2 = map5;
                                            hashSet3 = hashSet2;
                                            i5 = i2;
                                        } catch (InvocationTargetException e6) {
                                            e = e6;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName(), e);
                                            map2 = map5;
                                            hashSet3 = hashSet2;
                                            i5 = i2;
                                        }
                                        map2 = map5;
                                        hashSet3 = hashSet2;
                                        i5 = i2;
                                    default:
                                        map2 = map5;
                                        hashSet3 = hashSet2;
                                        break;
                                }
                            }
                            map = map2;
                            hashSet = hashSet3;
                            i = i5;
                            childAt.setLayoutParams(kteVar);
                            ktn ktnVar = ktkVar.b;
                            if (ktnVar.c == 0) {
                                childAt.setVisibility(ktnVar.b);
                            }
                            childAt.setAlpha(ktnVar.d);
                            kto ktoVar = ktkVar.e;
                            childAt.setRotation(ktoVar.c);
                            childAt.setRotationX(ktoVar.d);
                            childAt.setRotationY(ktoVar.e);
                            childAt.setScaleX(ktoVar.f);
                            childAt.setScaleY(ktoVar.g);
                            if (ktoVar.j != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(ktoVar.j);
                                if (viewFindViewById != null) {
                                    int top = viewFindViewById.getTop() + viewFindViewById.getBottom();
                                    int left = viewFindViewById.getLeft() + viewFindViewById.getRight();
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float f = left;
                                        float left2 = childAt.getLeft();
                                        float top2 = childAt.getTop();
                                        childAt.setPivotX((f / 2.0f) - left2);
                                        childAt.setPivotY((top / 2.0f) - top2);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(ktoVar.h)) {
                                    childAt.setPivotX(ktoVar.h);
                                }
                                if (!Float.isNaN(ktoVar.i)) {
                                    childAt.setPivotY(ktoVar.i);
                                }
                            }
                            childAt.setTranslationX(ktoVar.k);
                            childAt.setTranslationY(ktoVar.l);
                            childAt.setTranslationZ(ktoVar.m);
                            if (ktoVar.n) {
                                childAt.setElevation(ktoVar.o);
                            }
                        } else {
                            map = map2;
                            hashSet = hashSet3;
                            i = i5;
                        }
                    } else {
                        map = map2;
                        hashSet = hashSet3;
                        i = i5;
                        Log.v("ConstraintSet", a.g(id, "WARNING NO CONSTRAINTS for view "));
                    }
                }
                i5 = i + 1;
                map2 = map;
                hashSet3 = hashSet;
            }
            map = map2;
            hashSet = hashSet3;
            i = i5;
            i5 = i + 1;
            map2 = map;
            hashSet3 = hashSet;
        }
        Iterator it = hashSet3.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ktk ktkVar2 = (ktk) this.b.get(num);
            if (ktkVar2 != null) {
                ktl ktlVar2 = ktkVar2.d;
                if (ktlVar2.aj == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = ktlVar2.ak;
                    if (iArr2 != null) {
                        barrier2.j(iArr2);
                    } else {
                        String str3 = ktlVar2.al;
                        if (str3 != null) {
                            ktlVar2.ak = o(barrier2, str3);
                            barrier2.j(ktlVar2.ak);
                        }
                    }
                    barrier2.a = ktlVar2.ah;
                    barrier2.b(ktlVar2.ai);
                    kte kteVar2 = new kte();
                    barrier2.k();
                    ktkVar2.a(kteVar2);
                    constraintLayout.addView(barrier2, kteVar2);
                }
                if (ktlVar2.b) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    kte kteVar3 = new kte();
                    ktkVar2.a(kteVar3);
                    constraintLayout.addView(guideline, kteVar3);
                }
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = constraintLayout.getChildAt(i6);
            if (childAt2 instanceof ktc) {
                ((ktc) childAt2).g(constraintLayout);
            }
        }
    }
}
