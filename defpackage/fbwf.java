package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.AndroidRuntimeException;
import io.grpc.Status;
import io.grpc.StatusException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbwf {
    private static final fbra a = new fbwe(null, true);

    private fbwf() {
    }

    public static fbrg a(Parcel parcel, fbmw fbmwVar) {
        int i = parcel.readInt();
        if (i == 0) {
            return new fbrg();
        }
        Object[] objArr = new Object[i + i];
        int i2 = 0;
        int iDataPosition = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = parcel.readInt();
            int i5 = i2 + 4;
            byte[] bArrC = c(parcel, i4, i5);
            int i6 = i5 + i4;
            int i7 = i3 + i3;
            objArr[i7] = bArrC;
            int i8 = parcel.readInt();
            i2 = i6 + 4;
            if (i8 == -1) {
                fbuj fbujVar = (fbuj) fbmwVar.a(fbvm.h);
                if (!fbujVar.b) {
                    throw Status.i.withDescription("Parcelable metadata values not allowed").asException();
                }
                int iDataPosition2 = parcel.dataPosition();
                try {
                    Parcelable parcelable = parcel.readParcelable(fbwf.class.getClassLoader());
                    if (parcelable == null) {
                        throw Status.o.withDescription("Read null parcelable in metadata").asException();
                    }
                    fbra fbraVar = a;
                    Charset charset = fbpp.a;
                    objArr[i7 + 1] = new fbrd(fbraVar, parcelable);
                    iDataPosition += parcel.dataPosition() - iDataPosition2;
                    int i9 = fbujVar.c;
                    if (iDataPosition > 32768) {
                        throw Status.k.withDescription("Inbound Parcelables too large according to policy (see InboundParcelablePolicy)").asException();
                    }
                } catch (AndroidRuntimeException e) {
                    throw Status.o.d(e).withDescription("Failure reading parcelable in metadata").asException();
                }
            } else {
                if (i8 < 0) {
                    throw Status.o.withDescription("Unrecognized metadata sentinel").asException();
                }
                byte[] bArrC2 = c(parcel, i8, i2);
                i2 += i8;
                objArr[i7 + 1] = bArrC2;
            }
        }
        Charset charset2 = fbpp.a;
        return new fbrg(i, objArr);
    }

    public static void b(Parcel parcel, fbrg fbrgVar) {
        int i;
        int length;
        int i2;
        if (fbrgVar != null) {
            Charset charset = fbpp.a;
            i = fbrgVar.e;
        } else {
            i = 0;
        }
        if (i == 0) {
            parcel.writeInt(0);
            return;
        }
        Charset charset2 = fbpp.a;
        Object[] objArr = new Object[fbrgVar.a()];
        for (int i3 = 0; i3 < fbrgVar.e; i3++) {
            int i4 = i3 + i3;
            objArr[i4] = fbrgVar.k(i3);
            int i5 = i4 + 1;
            Object objD = fbrgVar.d(i3);
            if (!(objD instanceof byte[])) {
                objD = ((fbrd) objD).b();
            }
            objArr[i5] = objD;
        }
        parcel.writeInt(i);
        for (int i6 = 0; i6 < i; i6++) {
            int i7 = i6 + i6;
            byte[] bArr = (byte[]) objArr[i7];
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
            Object obj = objArr[i7 + 1];
            if (obj instanceof byte[]) {
                byte[] bArr2 = (byte[]) obj;
                parcel.writeInt(bArr2.length);
                parcel.writeByteArray(bArr2);
            } else if (obj instanceof fbwr) {
                parcel.writeInt(-1);
                ((fbwr) obj).a(parcel);
            } else {
                byte[] bArrB = fbvu.b();
                try {
                    InputStream inputStream = (InputStream) obj;
                    int i8 = 0;
                    while (true) {
                        length = bArrB.length;
                        if (i8 >= length || (i2 = inputStream.read(bArrB, i8, length - i8)) == -1) {
                            break;
                        } else {
                            i8 += i2;
                        }
                    }
                    if (i8 == length) {
                        throw Status.k.withDescription("Metadata value too large").asException();
                    }
                    parcel.writeInt(i8);
                    if (i8 > 0) {
                        parcel.writeByteArray(bArrB, 0, i8);
                    }
                } finally {
                    fbvu.a(bArrB);
                }
            }
        }
    }

    private static byte[] c(Parcel parcel, int i, int i2) throws StatusException {
        if (i2 + i > 8192) {
            throw Status.k.withDescription("Metadata too large").asException();
        }
        byte[] bArr = new byte[i];
        if (i > 0) {
            parcel.readByteArray(bArr);
        }
        return bArr;
    }
}
