package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejkx {
    public static String a(ezgi ezgiVar) {
        int i;
        int i2 = ezgiVar.c;
        switch (i2) {
            case 0:
                i = 30;
                break;
            case 1:
            case 8:
            case 10:
            default:
                i = 0;
                break;
            case 2:
                i = 1;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                i = 3;
                break;
            case 5:
                i = 4;
                break;
            case 6:
                i = 5;
                break;
            case 7:
                i = 6;
                break;
            case 9:
                i = 7;
                break;
            case 11:
                i = 8;
                break;
            case 12:
                i = 9;
                break;
            case 13:
                i = 10;
                break;
            case 14:
                i = 11;
                break;
            case 15:
                i = 12;
                break;
            case 16:
                i = 13;
                break;
            case 17:
                i = 14;
                break;
            case 18:
                i = 15;
                break;
            case 19:
                i = 16;
                break;
            case 20:
                i = 17;
                break;
            case 21:
                i = 18;
                break;
            case 22:
                i = 19;
                break;
            case 23:
                i = 20;
                break;
            case 24:
                i = 21;
                break;
            case 25:
                i = 22;
                break;
            case 26:
                i = 23;
                break;
            case 27:
                i = 24;
                break;
            case 28:
                i = 25;
                break;
            case 29:
                i = 26;
                break;
            case 30:
                i = 27;
                break;
            case 31:
                i = 28;
                break;
            case 32:
                i = 29;
                break;
        }
        if (i == 0) {
            throw null;
        }
        int i3 = i - 1;
        if (i3 == 0) {
            return (i2 == 2 ? (ezgk) ezgiVar.d : ezgk.a).c;
        }
        if (i3 == 5) {
            return (i2 == 7 ? (ezbj) ezgiVar.d : ezbj.a).b;
        }
        if (i3 == 9) {
            return (i2 == 13 ? (ezcr) ezgiVar.d : ezcr.a).b;
        }
        if (i3 == 11) {
            return (i2 == 15 ? (ezfp) ezgiVar.d : ezfp.a).b;
        }
        if (i3 == 15) {
            return (i2 == 19 ? (ezbn) ezgiVar.d : ezbn.a).c + " " + (ezgiVar.c == 19 ? (ezbn) ezgiVar.d : ezbn.a).e;
        }
        if (i3 == 17) {
            return (i2 == 21 ? (ezhe) ezgiVar.d : ezhe.a).b;
        }
        if (i3 != 2) {
            if (i3 != 3) {
                return "";
            }
            return (i2 == 5 ? (ezdc) ezgiVar.d : ezdc.a).b;
        }
        if (((i2 == 4 ? (ezen) ezgiVar.d : ezen.a).b & 1) == 0) {
            return "0";
        }
        ezor ezorVar = (ezgiVar.c == 4 ? (ezen) ezgiVar.d : ezen.a).d;
        if (ezorVar == null) {
            ezorVar = ezor.a;
        }
        return Long.toString(ezorVar.b);
    }
}
