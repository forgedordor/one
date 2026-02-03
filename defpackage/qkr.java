package defpackage;

import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qkr {
    public static final int a(pza pzaVar) {
        pzaVar.getClass();
        int iOrdinal = pzaVar.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return 1;
        }
        throw new fctg();
    }

    public static final int b(qbf qbfVar) {
        qbfVar.getClass();
        int iOrdinal = qbfVar.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        if (iOrdinal == 1) {
            return 1;
        }
        throw new fctg();
    }

    public static final int c(qbo qboVar) {
        qboVar.getClass();
        int iOrdinal = qboVar.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    i = 4;
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return 5;
                        }
                        throw new fctg();
                    }
                }
            }
        }
        return i;
    }

    public static final pza d(int i) {
        if (i == 0) {
            return pza.a;
        }
        if (i == 1) {
            return pza.b;
        }
        throw new IllegalArgumentException(a.e(i, "Could not convert ", " to BackoffPolicy"));
    }

    public static final qbf e(int i) {
        if (i == 0) {
            return qbf.a;
        }
        if (i == 1) {
            return qbf.b;
        }
        throw new IllegalArgumentException(a.e(i, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static final qbo f(int i) {
        if (i == 0) {
            return qbo.a;
        }
        if (i == 1) {
            return qbo.b;
        }
        if (i == 2) {
            return qbo.c;
        }
        if (i == 3) {
            return qbo.d;
        }
        if (i == 4) {
            return qbo.e;
        }
        if (i == 5) {
            return qbo.f;
        }
        throw new IllegalArgumentException(a.e(i, "Could not convert ", " to State"));
    }

    public static final qlh g(byte[] bArr) throws IOException {
        bArr.getClass();
        if (Build.VERSION.SDK_INT < 28 || bArr.length == 0) {
            return new qlh((Object) null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i = objectInputStream.readInt();
                int[] iArr = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = objectInputStream.readInt();
                }
                int i3 = objectInputStream.readInt();
                int[] iArr2 = new int[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    iArr2[i4] = objectInputStream.readInt();
                }
                NetworkRequest.Builder builder = new NetworkRequest.Builder();
                for (int i5 = 0; i5 < i3; i5++) {
                    int i6 = iArr2[i5];
                    try {
                        builder.addCapability(i6);
                    } catch (IllegalArgumentException e) {
                        qas.c();
                        Log.w(qlh.a, "Ignoring adding capability '" + i6 + '\'', e);
                    }
                }
                for (int i7 = 0; i7 < i; i7++) {
                    builder.addTransportType(iArr[i7]);
                }
                NetworkRequest networkRequestBuild = builder.build();
                networkRequestBuild.getClass();
                qlh qlhVar = new qlh(networkRequestBuild);
                fczl.a(objectInputStream, null);
                fczl.a(byteArrayInputStream, null);
                return qlhVar;
            } finally {
            }
        } finally {
        }
    }

    public static final Set h(byte[] bArr) throws IOException {
        ObjectInputStream objectInputStream;
        bArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                int i = objectInputStream.readInt();
                for (int i2 = 0; i2 < i; i2++) {
                    Uri uri = Uri.parse(objectInputStream.readUTF());
                    boolean z = objectInputStream.readBoolean();
                    uri.getClass();
                    linkedHashSet.add(new pzi(uri, z));
                }
                fczl.a(objectInputStream, null);
                fczl.a(byteArrayInputStream, null);
                return linkedHashSet;
            } finally {
            }
        } finally {
        }
    }

    public static final byte[] i(qlh qlhVar) throws IOException {
        Object obj;
        int[] iArrAC;
        int[] iArrAC2;
        if (Build.VERSION.SDK_INT < 28 || (obj = qlhVar.b) == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                if (Build.VERSION.SDK_INT >= 31) {
                    iArrAC = ((NetworkRequest) obj).getTransportTypes();
                    iArrAC.getClass();
                } else {
                    int[] iArr = {2, 0, 3, 6, 9, 8, 4, 1, 5};
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < 9; i++) {
                        int i2 = iArr[i];
                        if (((NetworkRequest) obj).hasTransport(i2)) {
                            arrayList.add(Integer.valueOf(i2));
                        }
                    }
                    iArrAC = fcva.aC(arrayList);
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    iArrAC2 = ((NetworkRequest) obj).getCapabilities();
                    iArrAC2.getClass();
                } else {
                    int[] iArr2 = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
                    ArrayList arrayList2 = new ArrayList();
                    for (int i3 = 0; i3 < 29; i3++) {
                        int i4 = iArr2[i3];
                        if (((NetworkRequest) obj).hasCapability(i4)) {
                            arrayList2.add(Integer.valueOf(i4));
                        }
                    }
                    iArrAC2 = fcva.aC(arrayList2);
                }
                objectOutputStream.writeInt(iArrAC.length);
                for (int i5 : iArrAC) {
                    objectOutputStream.writeInt(i5);
                }
                objectOutputStream.writeInt(iArrAC2.length);
                for (int i6 : iArrAC2) {
                    objectOutputStream.writeInt(i6);
                }
                fczl.a(objectOutputStream, null);
                fczl.a(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final byte[] j(Set set) throws IOException {
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    pzi pziVar = (pzi) it.next();
                    objectOutputStream.writeUTF(pziVar.a.toString());
                    objectOutputStream.writeBoolean(pziVar.b);
                }
                fczl.a(objectOutputStream, null);
                fczl.a(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final int k(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return 0;
        }
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                i3 = 3;
                if (i2 != 3) {
                    i3 = 4;
                    if (i2 != 4) {
                        if (Build.VERSION.SDK_INT >= 30 && i == 6) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + ((Object) qat.a(i)) + " to int");
                    }
                }
            }
        }
        return i3;
    }

    public static final int l(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT < 30 || i != 5) {
            throw new IllegalArgumentException(a.e(i, "Could not convert ", " to NetworkType"));
        }
        return 6;
    }
}
