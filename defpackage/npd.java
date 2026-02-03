package defpackage;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class npd {
    public static int a(int i) {
        int i2 = 0;
        while (i > 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    public static mbt b(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String[] strArrAi = mgb.ai(str, "=");
            if (strArrAi.length != 2) {
                mff.f("VorbisUtil", "Failed to parse Vorbis comment: ".concat(String.valueOf(str)));
            } else if (strArrAi[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(nqs.d(new mfr(Base64.decode(strArrAi[1], 0))));
                } catch (RuntimeException e) {
                    mff.g("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new nsb(strArrAi[0], strArrAi[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new mbt(arrayList);
    }

    public static npa c(mfr mfrVar, boolean z, boolean z2) throws mby {
        if (z) {
            d(3, mfrVar, false);
        }
        mfrVar.y((int) mfrVar.p());
        long jP = mfrVar.p();
        String[] strArr = new String[(int) jP];
        for (int i = 0; i < jP; i++) {
            strArr[i] = mfrVar.y((int) mfrVar.p());
        }
        if (z2 && (mfrVar.j() & 1) == 0) {
            throw new mby("framing bit expected to be set", null, true, 1);
        }
        return new npa(strArr);
    }

    public static boolean d(int i, mfr mfrVar, boolean z) throws mby {
        if (mfrVar.a() < 7) {
            if (z) {
                return false;
            }
            throw new mby("too short header: " + mfrVar.a(), null, true, 1);
        }
        if (mfrVar.j() != i) {
            if (z) {
                return false;
            }
            throw new mby("expected header type ".concat(String.valueOf(Integer.toHexString(i))), null, true, 1);
        }
        if (mfrVar.j() == 118 && mfrVar.j() == 111 && mfrVar.j() == 114 && mfrVar.j() == 98 && mfrVar.j() == 105 && mfrVar.j() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw new mby("expected characters 'vorbis'", null, true, 1);
    }
}
