package com.google.protobuf.contrib.android;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ejwl;
import defpackage.evrf;
import defpackage.evrr;
import defpackage.evtj;
import defpackage.evuh;
import defpackage.evwk;
import defpackage.evwl;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ProtoParsers {

    /* compiled from: PG */
    public static final class InternalDontUse<T extends evuh> implements evwl<T> {
        public static final Parcelable.Creator<InternalDontUse<?>> CREATOR = new evwk();
        private volatile byte[] a;
        private volatile evuh b;

        public InternalDontUse(byte[] bArr, evuh evuhVar) {
            boolean z = true;
            if (bArr == null && evuhVar == null) {
                z = false;
            }
            ejwl.b(z, "Must have a message or bytes");
            this.a = bArr;
            this.b = evuhVar;
        }

        @Override // defpackage.evwl
        public final evuh a(evuh evuhVar, evrr evrrVar) {
            try {
                return b(evuhVar, evrrVar);
            } catch (evtj e) {
                throw new IllegalStateException(e);
            }
        }

        final evuh b(evuh evuhVar, evrr evrrVar) {
            if (this.b == null) {
                this.b = evuhVar.toBuilder().mergeFrom(this.a, evrrVar).build();
            }
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            if (this.a == null) {
                byte[] bArr = new byte[this.b.getSerializedSize()];
                try {
                    this.b.writeTo(evrf.ab(bArr));
                    this.a = bArr;
                } catch (IOException e) {
                    throw new AssertionError(e);
                }
            }
            parcel.writeInt(this.a.length);
            parcel.writeByteArray(this.a);
        }
    }

    public static evuh a(Parcel parcel, evuh evuhVar, evrr evrrVar) {
        return b((InternalDontUse) parcel.readTypedObject(InternalDontUse.CREATOR), evuhVar, evrrVar);
    }

    public static evuh b(InternalDontUse internalDontUse, evuh evuhVar, evrr evrrVar) {
        return internalDontUse.b(evuhVar.getDefaultInstanceForType(), evrrVar);
    }

    public static evuh c(Intent intent, String str, evuh evuhVar, evrr evrrVar) {
        InternalDontUse internalDontUse;
        Parcelable parcelableExtra = intent.getParcelableExtra(str);
        if (parcelableExtra instanceof Bundle) {
            Bundle bundle = (Bundle) parcelableExtra;
            bundle.setClassLoader(InternalDontUse.class.getClassLoader());
            internalDontUse = (InternalDontUse) bundle.getParcelable("protoparsers");
        } else {
            internalDontUse = (InternalDontUse) parcelableExtra;
        }
        return b(internalDontUse, evuhVar, evrrVar);
    }

    public static evuh d(Bundle bundle, String str, evuh evuhVar, evrr evrrVar) {
        InternalDontUse internalDontUse;
        Parcelable parcelable = bundle.getParcelable(str);
        if (parcelable instanceof Bundle) {
            Bundle bundle2 = (Bundle) parcelable;
            bundle2.setClassLoader(InternalDontUse.class.getClassLoader());
            internalDontUse = (InternalDontUse) bundle2.getParcelable("protoparsers");
        } else {
            internalDontUse = (InternalDontUse) parcelable;
        }
        return b(internalDontUse, evuhVar, evrrVar);
    }

    public static evuh e(Parcel parcel, evuh evuhVar, evrr evrrVar) {
        try {
            return a(parcel, evuhVar, evrrVar);
        } catch (evtj e) {
            throw new RuntimeException(e);
        }
    }

    public static evuh f(Bundle bundle, String str, evuh evuhVar, evrr evrrVar) {
        try {
            return d(bundle, str, evuhVar, evrrVar);
        } catch (evtj e) {
            throw new RuntimeException(e);
        }
    }

    public static evuh g(byte[] bArr, evuh evuhVar) {
        try {
            return evuhVar.toBuilder().mergeFrom(bArr).build();
        } catch (evtj e) {
            throw new RuntimeException(e);
        }
    }

    public static void h(Parcel parcel, evuh evuhVar) {
        parcel.writeTypedObject(new InternalDontUse(null, evuhVar), 0);
    }

    public static void i(Intent intent, String str, evuh evuhVar) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("protoparsers", new InternalDontUse(null, evuhVar));
        intent.putExtra(str, bundle);
    }

    public static void j(Bundle bundle, String str, evuh evuhVar) {
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("protoparsers", new InternalDontUse(null, evuhVar));
        bundle.putParcelable(str, bundle2);
    }
}
