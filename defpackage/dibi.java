package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dibi extends diaj {
    public dibi() {
        super(dbjt.SEND_BROADCAST, 10L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.diaj
    public final diap a(diap diapVar, ejwi ejwiVar) {
        if (!ejwiVar.g() || ((dbkw) ejwiVar.c()).b != 3) {
            throw new IllegalArgumentException();
        }
        dbkw dbkwVar = (dbkw) ejwiVar.c();
        dbkp dbkpVar = dbkwVar.b == 3 ? (dbkp) dbkwVar.c : dbkp.a;
        Context context = diapVar.b;
        String packageName = context.getPackageName();
        Intent intent = new Intent().setPackage(packageName);
        if ((dbkpVar.b & 1) != 0) {
            intent.setAction(dbkpVar.c);
        }
        if ((dbkpVar.b & 2) != 0) {
            intent.setComponent(new ComponentName(packageName, dbkpVar.d));
        }
        if ((dbkpVar.b & 4) != 0) {
            intent.setData(Uri.parse(dbkpVar.e));
        }
        Iterator<E> it = dbkpVar.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
                if (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.isEmpty()) {
                    throw new IllegalStateException("No receiver for intent. ".concat(String.valueOf(String.valueOf(intent))));
                }
                Log.d("SEND_BROADCAST_FIX", "Broadcasting: intent=".concat(String.valueOf(String.valueOf(intent))));
                context.sendBroadcast(intent);
                return diapVar;
            }
            dbkj dbkjVar = (dbkj) it.next();
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
                    for (int i = 0; i < dbkjVar.f.size(); i++) {
                        strArr[i] = (String) dbkjVar.f.get(i);
                    }
                    intent.putExtra(dbkjVar.d, strArr);
                    break;
                case 10:
                    byte[] bArr = new byte[dbkjVar.g.size()];
                    for (int i2 = 0; i2 < dbkjVar.g.size(); i2++) {
                        bArr[i2] = (byte) dbkjVar.g.d(i2);
                    }
                    intent.putExtra(dbkjVar.d, bArr);
                    break;
                case 11:
                    short[] sArr = new short[dbkjVar.h.size()];
                    for (int i3 = 0; i3 < dbkjVar.h.size(); i3++) {
                        sArr[i3] = (short) dbkjVar.h.d(i3);
                    }
                    intent.putExtra(dbkjVar.d, sArr);
                    break;
                case 12:
                    int[] iArr = new int[dbkjVar.i.size()];
                    for (int i4 = 0; i4 < dbkjVar.i.size(); i4++) {
                        iArr[i4] = dbkjVar.i.d(i4);
                    }
                    intent.putExtra(dbkjVar.d, iArr);
                    break;
                case 13:
                    long[] jArr = new long[dbkjVar.j.size()];
                    for (int i5 = 0; i5 < dbkjVar.j.size(); i5++) {
                        jArr[i5] = dbkjVar.j.a(i5);
                    }
                    intent.putExtra(dbkjVar.d, jArr);
                    break;
                case 14:
                    float[] fArr = new float[dbkjVar.k.size()];
                    for (int i6 = 0; i6 < dbkjVar.k.size(); i6++) {
                        fArr[i6] = dbkjVar.k.d(i6);
                    }
                    intent.putExtra(dbkjVar.d, fArr);
                    break;
                case 15:
                    double[] dArr = new double[dbkjVar.l.size()];
                    for (int i7 = 0; i7 < dbkjVar.l.size(); i7++) {
                        dArr[i7] = dbkjVar.l.d(i7);
                    }
                    intent.putExtra(dbkjVar.d, dArr);
                    break;
                case 16:
                    boolean[] zArr = new boolean[dbkjVar.m.size()];
                    for (int i8 = 0; i8 < dbkjVar.m.size(); i8++) {
                        zArr[i8] = dbkjVar.m.g(i8);
                    }
                    intent.putExtra(dbkjVar.d, zArr);
                    break;
                default:
                    throw new IllegalArgumentException("Unrecognized extra type");
            }
        }
    }

    @Override // defpackage.diaj
    public final String b() {
        return "SEND_BROADCAST_FIX";
    }
}
