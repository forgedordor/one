package defpackage;

import android.util.Base64;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdyv {
    public static final String a(eyga eygaVar) {
        Optional optionalA = civb.a(eygaVar, civa.IMAGE_CAPTION_NAMESPACE, "Image-Caption");
        if (!optionalA.isPresent()) {
            return null;
        }
        byte[] bArrDecode = Base64.decode((String) optionalA.get(), 2);
        bArrDecode.getClass();
        return new String(bArrDecode, fdfy.a);
    }
}
