package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import com.android.vcard.VCardConfig;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.dcwm;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class FileTeleporter extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FileTeleporter> CREATOR = new dcwm();
    public ParcelFileDescriptor a;
    public final String b;
    public final String c;
    public byte[] d;
    public File e;

    public FileTeleporter(ParcelFileDescriptor parcelFileDescriptor, String str, String str2) {
        this.a = parcelFileDescriptor;
        this.b = str;
        this.c = str2;
    }

    public final void a(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("FileTeleporter", "Could not close stream", e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) throws IOException {
        if (this.a == null) {
            File file = this.e;
            if (file == null) {
                throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel.");
            }
            try {
                File fileCreateTempFile = File.createTempFile("teleporter", ".tmp", file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                    this.a = ParcelFileDescriptor.open(fileCreateTempFile, VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                    fileCreateTempFile.delete();
                    DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
                    try {
                        try {
                            dataOutputStream.writeInt(this.d.length);
                            dataOutputStream.writeUTF(this.b);
                            dataOutputStream.writeUTF(this.c);
                            dataOutputStream.write(this.d);
                        } catch (IOException e) {
                            throw new IllegalStateException("Could not write into unlinked file", e);
                        }
                    } finally {
                        a(dataOutputStream);
                    }
                } catch (FileNotFoundException unused) {
                    throw new IllegalStateException("Temporary file is somehow already deleted.");
                }
            } catch (IOException e2) {
                throw new IllegalStateException("Could not create temporary file:", e2);
            }
        }
        int iA = dclw.a(parcel);
        dclw.k(parcel, 2, this.a, i, false);
        dclw.m(parcel, 3, this.b, false);
        dclw.m(parcel, 4, this.c, false);
        dclw.c(parcel, iA);
    }

    public FileTeleporter(byte[] bArr, String str) {
        this(null, "text/plain", str);
        this.d = bArr;
    }
}
