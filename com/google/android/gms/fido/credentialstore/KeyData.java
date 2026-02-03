package com.google.android.gms.fido.credentialstore;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dcxb;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class KeyData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<KeyData> CREATOR = new dcxb();
    public final boolean a;
    public final byte[] b;
    public final PublicKey c;
    public final PrivateKey d;
    public final String e;
    public final byte[] f;
    public final byte[] g;
    public final Account h;
    public final boolean i;
    public final KeyMetadata j;
    public final boolean k;
    public final byte[] l;
    public final byte[] m;
    public final long n;
    public final boolean o;
    public final int p;

    public KeyData(int i, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3, String str, byte[] bArr4, byte[] bArr5, Account account, boolean z2, KeyMetadata keyMetadata, boolean z3, byte[] bArr6, byte[] bArr7, long j, boolean z4) throws InvalidKeySpecException, NoSuchAlgorithmException {
        Throwable th;
        PublicKey publicKeyGeneratePublic;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            throw new IllegalArgumentException("Value is not a known key type");
                        }
                    }
                }
            }
        }
        this.p = i2;
        this.a = z;
        this.b = bArr;
        this.e = str;
        this.f = bArr4;
        this.g = bArr5;
        this.h = account;
        this.i = z2;
        this.j = keyMetadata;
        this.k = z3;
        this.l = bArr6;
        this.m = bArr7;
        this.n = j;
        this.o = z4;
        PrivateKey privateKeyGeneratePrivate = null;
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("EC");
            publicKeyGeneratePublic = bArr2 != null ? keyFactory.generatePublic(new X509EncodedKeySpec(bArr2)) : null;
            if (bArr3 != null) {
                try {
                    privateKeyGeneratePrivate = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(bArr3));
                } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                    th = e;
                    Log.e("KeyData", "unable to decode key pair", th);
                    this.c = publicKeyGeneratePublic;
                    this.d = privateKeyGeneratePrivate;
                }
            }
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e2) {
            th = e2;
            publicKeyGeneratePublic = null;
        }
        this.c = publicKeyGeneratePublic;
        this.d = privateKeyGeneratePrivate;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = dclw.a(parcel);
        dclw.i(parcel, 1, this.p);
        dclw.d(parcel, 2, this.a);
        dclw.f(parcel, 3, this.b, false);
        PublicKey publicKey = this.c;
        dclw.f(parcel, 4, publicKey == null ? null : publicKey.getEncoded(), false);
        PrivateKey privateKey = this.d;
        dclw.f(parcel, 5, privateKey != null ? privateKey.getEncoded() : null, false);
        dclw.m(parcel, 6, this.e, false);
        dclw.f(parcel, 7, this.f, false);
        dclw.f(parcel, 8, this.g, false);
        dclw.k(parcel, 9, this.h, i, false);
        dclw.d(parcel, 10, this.i);
        dclw.k(parcel, 11, this.j, i, false);
        dclw.d(parcel, 12, this.k);
        dclw.f(parcel, 13, this.l, false);
        dclw.f(parcel, 14, this.m, false);
        dclw.j(parcel, 15, this.n);
        dclw.d(parcel, 16, this.o);
        dclw.c(parcel, iA);
    }
}
