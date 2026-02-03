package defpackage;

import android.net.Uri;
import android.provider.ContactsContract;
import com.android.vcard.VCardConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avef {
    public static final avef a;
    public static final avef b;
    private static final /* synthetic */ avef[] c;

    static {
        avef avefVar = new avef("PHONE", 0);
        a = avefVar;
        avef avefVar2 = new avef(VCardConstants.PROPERTY_EMAIL, 1);
        b = avefVar2;
        avef[] avefVarArr = {avefVar, avefVar2};
        c = avefVarArr;
        fczb.a(avefVarArr);
    }

    private avef(String str, int i) {
    }

    public static avef[] values() {
        return (avef[]) c.clone();
    }

    public final Uri a(String str, boolean z) {
        Uri uri;
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw null;
            }
            uri = ContactsContract.CommonDataKinds.Email.CONTENT_LOOKUP_URI;
            uri.getClass();
        } else if (z) {
            uri = ContactsContract.PhoneLookup.ENTERPRISE_CONTENT_FILTER_URI;
            uri.getClass();
        } else {
            uri = ContactsContract.PhoneLookup.CONTENT_FILTER_URI;
            uri.getClass();
        }
        Uri uriBuild = uri.buildUpon().appendPath(str).build();
        uriBuild.getClass();
        return uriBuild;
    }

    public final String[] b(boolean z) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return z ? avgc.a : avgc.b;
        }
        if (iOrdinal == 1) {
            return avgc.c;
        }
        throw null;
    }
}
