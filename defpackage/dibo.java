package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dibo extends diaj {
    public dibo() {
        super(dbjt.START_SERVICE, 10L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.diaj
    public final diap a(diap diapVar, ejwi ejwiVar) {
        if (!ejwiVar.g() || ((dbkw) ejwiVar.c()).b != 10) {
            throw new IllegalArgumentException();
        }
        dbkw dbkwVar = (dbkw) ejwiVar.c();
        dbkt dbktVar = dbkwVar.b == 10 ? (dbkt) dbkwVar.c : dbkt.a;
        Context context = diapVar.b;
        String packageName = context.getPackageName();
        Intent intent = new Intent().setPackage(packageName);
        if ((dbktVar.b & 1) != 0) {
            intent.setAction(dbktVar.c);
        }
        if ((dbktVar.b & 2) != 0) {
            intent.setComponent(new ComponentName(packageName, dbktVar.d));
        }
        for (int i = 0; i < dbktVar.e.size(); i++) {
            intent.addCategory((String) dbktVar.e.get(i));
        }
        for (dbkj dbkjVar : dbktVar.f) {
            int iA = dbki.a(dbkjVar.e);
            if (iA == 0) {
                iA = 1;
            }
            switch (iA - 2) {
                case 0:
                    throw new IllegalArgumentException("Can't assign unknown extra");
                case 1:
                    intent.putExtra(dbkjVar.d, dbkjVar.b == 3 ? (String) dbkjVar.c : "");
                    break;
                case 2:
                    intent.putExtra(dbkjVar.d, (byte) (dbkjVar.b == 4 ? ((Integer) dbkjVar.c).intValue() : 0));
                    break;
                case 3:
                    intent.putExtra(dbkjVar.d, (short) (dbkjVar.b == 5 ? ((Integer) dbkjVar.c).intValue() : 0));
                    break;
                case 4:
                    intent.putExtra(dbkjVar.d, dbkjVar.b == 6 ? ((Integer) dbkjVar.c).intValue() : 0);
                    break;
                case 5:
                    intent.putExtra(dbkjVar.d, dbkjVar.b == 7 ? ((Long) dbkjVar.c).longValue() : 0L);
                    break;
                case 6:
                    intent.putExtra(dbkjVar.d, dbkjVar.b == 8 ? ((Float) dbkjVar.c).floatValue() : 0.0f);
                    break;
                case 7:
                    intent.putExtra(dbkjVar.d, dbkjVar.b == 9 ? ((Double) dbkjVar.c).doubleValue() : 0.0d);
                    break;
                case 8:
                    intent.putExtra(dbkjVar.d, dbkjVar.b == 10 ? ((Boolean) dbkjVar.c).booleanValue() : false);
                    break;
                case 9:
                    String[] strArr = new String[dbkjVar.f.size()];
                    for (int i2 = 0; i2 < dbkjVar.f.size(); i2++) {
                        strArr[i2] = (String) dbkjVar.f.get(i2);
                    }
                    intent.putExtra(dbkjVar.d, strArr);
                    break;
                case 10:
                    byte[] bArr = new byte[dbkjVar.g.size()];
                    for (int i3 = 0; i3 < dbkjVar.g.size(); i3++) {
                        bArr[i3] = (byte) dbkjVar.g.d(i3);
                    }
                    intent.putExtra(dbkjVar.d, bArr);
                    break;
                case 11:
                    short[] sArr = new short[dbkjVar.h.size()];
                    for (int i4 = 0; i4 < dbkjVar.h.size(); i4++) {
                        sArr[i4] = (short) dbkjVar.h.d(i4);
                    }
                    intent.putExtra(dbkjVar.d, sArr);
                    break;
                case 12:
                    int[] iArr = new int[dbkjVar.i.size()];
                    for (int i5 = 0; i5 < dbkjVar.i.size(); i5++) {
                        iArr[i5] = dbkjVar.i.d(i5);
                    }
                    intent.putExtra(dbkjVar.d, iArr);
                    break;
                case 13:
                    long[] jArr = new long[dbkjVar.j.size()];
                    for (int i6 = 0; i6 < dbkjVar.j.size(); i6++) {
                        jArr[i6] = dbkjVar.j.a(i6);
                    }
                    intent.putExtra(dbkjVar.d, jArr);
                    break;
                case 14:
                    float[] fArr = new float[dbkjVar.k.size()];
                    for (int i7 = 0; i7 < dbkjVar.k.size(); i7++) {
                        fArr[i7] = dbkjVar.k.d(i7);
                    }
                    intent.putExtra(dbkjVar.d, fArr);
                    break;
                case 15:
                    double[] dArr = new double[dbkjVar.l.size()];
                    for (int i8 = 0; i8 < dbkjVar.l.size(); i8++) {
                        dArr[i8] = dbkjVar.l.d(i8);
                    }
                    intent.putExtra(dbkjVar.d, dArr);
                    break;
                case 16:
                    boolean[] zArr = new boolean[dbkjVar.m.size()];
                    for (int i9 = 0; i9 < dbkjVar.m.size(); i9++) {
                        zArr[i9] = dbkjVar.m.g(i9);
                    }
                    intent.putExtra(dbkjVar.d, zArr);
                    break;
                default:
                    throw new IllegalArgumentException("Unrecognized extra type");
            }
        }
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            throw new IllegalStateException("No receiver for intent. ".concat(String.valueOf(String.valueOf(intent))));
        }
        Log.i("START_SERVICE_FIX", "Starting service: intent=".concat(String.valueOf(String.valueOf(intent))));
        if (dbktVar.g) {
            context.startForegroundService(intent);
            return diapVar;
        }
        context.startService(intent);
        return diapVar;
    }

    @Override // defpackage.diaj
    public final String b() {
        return "START_SERVICE_FIX";
    }
}
