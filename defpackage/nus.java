package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nus {
    public static final byte[] a(List list, long j) {
        ejvr ejvrVar = new ejvr() { // from class: nur
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                mdu mduVar = (mdu) obj;
                Bundle bundle = new Bundle();
                CharSequence charSequence = mduVar.u;
                if (charSequence != null) {
                    bundle.putCharSequence(mdu.a, charSequence);
                    if (charSequence instanceof Spanned) {
                        Spanned spanned = (Spanned) charSequence;
                        String str = mdx.a;
                        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                        for (mea meaVar : (mea[]) spanned.getSpans(0, spanned.length(), mea.class)) {
                            Bundle bundle2 = new Bundle();
                            bundle2.putString(mea.a, meaVar.c);
                            bundle2.putInt(mea.b, meaVar.d);
                            arrayList.add(mdx.a(spanned, meaVar, 1, bundle2));
                        }
                        for (mec mecVar : (mec[]) spanned.getSpans(0, spanned.length(), mec.class)) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putInt(mec.a, mecVar.d);
                            bundle3.putInt(mec.b, mecVar.e);
                            bundle3.putInt(mec.c, mecVar.f);
                            arrayList.add(mdx.a(spanned, mecVar, 2, bundle3));
                        }
                        for (mdy mdyVar : (mdy[]) spanned.getSpans(0, spanned.length(), mdy.class)) {
                            arrayList.add(mdx.a(spanned, mdyVar, 3, null));
                        }
                        for (med medVar : (med[]) spanned.getSpans(0, spanned.length(), med.class)) {
                            Bundle bundle4 = new Bundle();
                            bundle4.putString(med.a, medVar.b);
                            arrayList.add(mdx.a(spanned, medVar, 4, bundle4));
                        }
                        if (!arrayList.isEmpty()) {
                            bundle.putParcelableArrayList(mdu.b, arrayList);
                        }
                    }
                }
                bundle.putSerializable(mdu.c, mduVar.v);
                bundle.putSerializable(mdu.d, mduVar.w);
                bundle.putFloat(mdu.g, mduVar.y);
                bundle.putInt(mdu.h, mduVar.z);
                bundle.putInt(mdu.i, mduVar.A);
                bundle.putFloat(mdu.j, mduVar.B);
                bundle.putInt(mdu.k, mduVar.C);
                bundle.putInt(mdu.l, mduVar.H);
                bundle.putFloat(mdu.m, mduVar.I);
                bundle.putFloat(mdu.n, mduVar.D);
                bundle.putFloat(mdu.o, mduVar.E);
                bundle.putBoolean(mdu.q, mduVar.F);
                bundle.putInt(mdu.p, mduVar.G);
                bundle.putInt(mdu.r, mduVar.J);
                bundle.putFloat(mdu.s, mduVar.K);
                bundle.putInt(mdu.t, mduVar.L);
                Bitmap bitmap = mduVar.x;
                if (bitmap != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    mee.c(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                    bundle.putByteArray(mdu.f, byteArrayOutputStream.toByteArray());
                }
                return bundle;
            }
        };
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ejvrVar.apply(it.next()));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
