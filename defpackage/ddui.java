package defpackage;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.mdisync.internal.SyncRequest;
import com.google.android.gms.mdisync.internal.TeleportingSyncRequest;
import java.io.DataInputStream;
import java.io.IOException;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class ddui implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) throws IOException {
        ParcelFileDescriptor fileDescriptor = parcel.readFileDescriptor();
        try {
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(fileDescriptor));
            int iAvailable = dataInputStream.available();
            byte[] bArr = new byte[iAvailable];
            dataInputStream.read(bArr);
            dataInputStream.close();
            fileDescriptor.close();
            Parcel parcelObtain = Parcel.obtain();
            try {
                parcelObtain.unmarshall(bArr, 0, iAvailable);
                parcelObtain.setDataPosition(0);
                int iH = dclv.h(parcelObtain);
                SyncRequest syncRequest = null;
                while (parcelObtain.dataPosition() < iH) {
                    int i = parcelObtain.readInt();
                    if (dclv.d(i) != 1) {
                        dclv.C(parcelObtain, i);
                    } else {
                        syncRequest = (SyncRequest) dclv.n(parcelObtain, i, SyncRequest.CREATOR);
                    }
                }
                dclv.B(parcelObtain, iH);
                return new TeleportingSyncRequest(syncRequest);
            } finally {
                parcelObtain.recycle();
            }
        } catch (IOException e) {
            throw new dduj("Couldn't read from unlinked file.", e);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TeleportingSyncRequest[i];
    }
}
