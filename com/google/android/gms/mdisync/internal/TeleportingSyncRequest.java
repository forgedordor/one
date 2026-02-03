package com.google.android.gms.mdisync.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dclw;
import defpackage.ddui;
import defpackage.dduj;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class TeleportingSyncRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TeleportingSyncRequest> CREATOR = new ddui();
    public final SyncRequest a;

    public TeleportingSyncRequest(SyncRequest syncRequest) {
        this.a = syncRequest;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                int iA = dclw.a(parcelObtain);
                dclw.k(parcelObtain, 1, this.a, i, false);
                dclw.c(parcelObtain, iA);
                byte[] bArrMarshall = parcelObtain.marshall();
                File fileCreateTempFile = File.createTempFile("teleporter", ".tmp", null);
                RandomAccessFile randomAccessFile = new RandomAccessFile(fileCreateTempFile, "rw");
                randomAccessFile.write(bArrMarshall);
                randomAccessFile.seek(0L);
                fileCreateTempFile.delete();
                parcel.writeFileDescriptor(randomAccessFile.getFD());
                randomAccessFile.close();
            } catch (IOException e) {
                throw new dduj("Couldn't write SafeParcelable to unlinked file.", e);
            }
        } finally {
            parcelObtain.recycle();
        }
    }
}
