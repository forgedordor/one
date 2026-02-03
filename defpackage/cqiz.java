package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqiz {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/contact/ContactUtil");
    public static final cczv b = cdag.l(cdag.b, "directory_query_limit", "100");
    public final Context c;
    public final fcsu d;
    public final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;

    public cqiz(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        this.c = context;
        this.d = fcsuVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.e = fcsuVar4;
        this.h = fcsuVar5;
    }

    public static Cursor a(Cursor cursor) {
        try {
            cvw cvwVar = new cvw();
            ArrayList arrayList = new ArrayList(cursor.getCount());
            Bundle extras = cursor.getExtras();
            if (extras == null) {
                ekrw ekrwVarJ = a.j();
                ekrwVarJ.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/util/contact/ContactUtil", "mergeContactsWithSameLookupKey", 992, "ContactUtil.java")).q("Got a cursor without extra.");
            }
            int[] intArray = extras == null ? null : extras.getIntArray("android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS");
            if (intArray != null && intArray.length == 0) {
                intArray = null;
            }
            int i = intArray == null ? 0 : intArray[0];
            int i2 = 0;
            int i3 = 0;
            while (cursor.moveToNext()) {
                String string = cursor.getString(6);
                Object[] objArr = (Object[]) cvwVar.get(string);
                if (objArr == null) {
                    String[] strArr = cqiw.a;
                    Object[] objArr2 = {Long.valueOf(cursor.getLong(0)), cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4), cursor.getString(5), cursor.getString(6), Long.valueOf(cursor.getLong(7)), cursor.getString(8), cursor.getString(9)};
                    arrayList.add(objArr2);
                    cvwVar.put(string, objArr2);
                } else {
                    objArr[3] = o(objArr[3], cursor.getString(3));
                    objArr[4] = o(objArr[4], cursor.getString(4));
                    objArr[5] = o(objArr[5], cursor.getString(5));
                    if (intArray != null && i2 < intArray.length) {
                        intArray[i2] = intArray[i2] - 1;
                    }
                }
                if (intArray != null && (i3 = i3 + 1) >= i) {
                    i2++;
                    if (i2 < intArray.length) {
                        i = intArray[i2];
                    }
                    i3 = 0;
                }
            }
            MatrixCursor matrixCursor = new MatrixCursor(cqiw.a, arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                matrixCursor.addRow((Object[]) it.next());
            }
            String[] stringArray = extras == null ? null : extras.getStringArray("android.provider.extra.ADDRESS_BOOK_INDEX_TITLES");
            if (stringArray != null && intArray != null) {
                cqaz.a(stringArray.length, intArray.length);
                Bundle bundle = new Bundle();
                bundle.putStringArray("android.provider.extra.ADDRESS_BOOK_INDEX_TITLES", stringArray);
                bundle.putIntArray("android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS", intArray);
                matrixCursor.setExtras(bundle);
            }
            return matrixCursor;
        } finally {
            cursor.close();
        }
    }

    public static Uri b(Uri uri, String str, long j) {
        Uri.Builder builderBuildUpon = uri.buildUpon();
        if (uri.equals(ContactsContract.CommonDataKinds.Phone.CONTENT_FILTER_URI) || uri.equals(ContactsContract.CommonDataKinds.Email.CONTENT_FILTER_URI)) {
            builderBuildUpon.appendQueryParameter("limit", (String) b.e());
        }
        return builderBuildUpon.appendPath(str).appendQueryParameter("directory", String.valueOf(j)).build();
    }

    public static boolean k(String str) {
        return str != null && str.contains("@");
    }

    private final cqjc n(Uri uri, String str, cqjb cqjbVar, CancellationSignal cancellationSignal) {
        if (!((crma) this.d.b()).h()) {
            return new cqip(cqjbVar, null);
        }
        try {
            return new cqip(cqjbVar, new bacf(this.c, b(uri, str, cqjbVar.a()), cqiw.a, null, null, "sort_key", cancellationSignal).a());
        } catch (OperationCanceledException e) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarH).g(e)).h("com/google/android/apps/messaging/shared/util/contact/ContactUtil", "filterPhonesInternal", (char) 665, "ContactUtil.java")).q("Query cancelled, not returning contacts search results.");
            return new cqip(cqjbVar, null);
        }
    }

    private static String o(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        if (obj != null) {
            sb.append(obj);
        } else {
            sb.append("\u0000");
        }
        sb.append("\u001f");
        if (obj2 != null) {
            sb.append(obj2);
        } else {
            sb.append("\u0000");
        }
        return sb.toString();
    }

    private final bacf p(Collection collection, Uri uri, String[] strArr) {
        return !((crma) this.d.b()).h() ? new bacf(this.c, Uri.EMPTY, null, null, null, null) : new bacf(this.c, uri.buildUpon().appendQueryParameter("directory", "0").appendQueryParameter("android.provider.extra.ADDRESS_BOOK_INDEX", "true").build(), strArr, String.format("%s IN (%s)", "lookup", TextUtils.join(",", Collections.nCopies(collection.size(), "?"))), (String[]) collection.toArray(new String[0]), null);
    }

    public final bacf c(Collection collection) {
        return p(collection, ContactsContract.CommonDataKinds.Email.CONTENT_URI, cqit.a);
    }

    public final bacf d(Collection collection) {
        return p(collection, ContactsContract.CommonDataKinds.Phone.CONTENT_URI, cqiw.a);
    }

    public final bacf e() {
        if (!((crma) this.d.b()).h()) {
            return new bacf(this.c, Uri.EMPTY, null, null, null, null);
        }
        return new bacf(this.c, ContactsContract.CommonDataKinds.Phone.CONTENT_URI.buildUpon().appendQueryParameter("directory", "0").appendQueryParameter("android.provider.extra.ADDRESS_BOOK_INDEX", "true").build(), cqiw.a, null, null, "sort_key");
    }

    public final bacf f() {
        return !((crma) this.d.b()).h() ? new bacf(this.c, Uri.EMPTY, null, null, null, null) : new bacf(this.c, ContactsContract.Profile.CONTENT_URI, cqix.a, null, null, null);
    }

    public final cqjc g(String str, cqjb cqjbVar, CancellationSignal cancellationSignal) {
        return k(str) ? h(ContactsContract.CommonDataKinds.Email.ENTERPRISE_CONTENT_FILTER_URI, str, cqjbVar, cancellationSignal) : n(ContactsContract.CommonDataKinds.Phone.ENTERPRISE_CONTENT_FILTER_URI, str, cqjbVar, cancellationSignal);
    }

    public final cqjc h(Uri uri, String str, cqjb cqjbVar, CancellationSignal cancellationSignal) {
        if (!((crma) this.d.b()).h()) {
            return new cqip(cqjbVar, null);
        }
        try {
            return new cqip(cqjbVar, new bacf(this.c, b(uri, str, cqjbVar.a()), cqiw.a, null, null, "sort_key", cancellationSignal).a());
        } catch (OperationCanceledException e) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarH).g(e)).h("com/google/android/apps/messaging/shared/util/contact/ContactUtil", "filterEmailsInternal", (char) 755, "ContactUtil.java")).q("Query cancelled, not returning contacts search results.");
            return new cqip(cqjbVar, null);
        }
    }

    public final cqjc i(String str, CancellationSignal cancellationSignal) {
        return n(ContactsContract.CommonDataKinds.Phone.CONTENT_FILTER_URI, str, cqjb.a, cancellationSignal);
    }

    public final String j(long j) throws Throwable {
        bacf bacfVar;
        Cursor cursor = null;
        string = null;
        String string = null;
        if (ContactsContract.Contacts.isEnterpriseContactId(j)) {
            return null;
        }
        try {
            if (((crma) this.d.b()).h()) {
                bacfVar = new bacf(this.c, ContactsContract.Contacts.CONTENT_URI.buildUpon().appendPath(String.valueOf(j)).appendPath(GroupManagementRequest.DATA_TAG).build(), cqiy.a, "mimetype=? AND display_name=data1", new String[]{"vnd.android.cursor.item/name"}, null);
            } else {
                bacfVar = new bacf(this.c, Uri.EMPTY, null, null, null, null);
            }
            Cursor cursorA = bacfVar.a();
            if (cursorA != null) {
                try {
                    if (cursorA.moveToFirst()) {
                        string = cursorA.getString(1);
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorA;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorA != null) {
                cursorA.close();
            }
            return string;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final qxf l(String str, alqm alqmVar, int i, String str2, long j, String str3, long j2, long j3, Uri uri, boolean z) {
        alqmVar.getClass();
        if (z) {
            return new bacc(str, alqmVar, i, str2, j, Long.valueOf(j2), j3, uri, true, str3);
        }
        return new bacc(str, alqmVar, i, str2, j, Long.valueOf(j2), j3, uri, false, str3);
    }

    public final Cursor m(alqm alqmVar) {
        bacf bacfVar;
        bacf bacfVar2;
        String strB = ejwk.b(alqmVar.j());
        fcsu fcsuVar = this.d;
        if (!((crma) fcsuVar.b()).h() || TextUtils.isEmpty(strB.trim())) {
            return null;
        }
        cqce cqceVar = cmvy.a;
        if (alwh.i(strB)) {
            if (((crma) fcsuVar.b()).h()) {
                bacfVar2 = new bacf(this.c, ContactsContract.CommonDataKinds.Email.ENTERPRISE_CONTENT_LOOKUP_URI.buildUpon().appendPath(strB).appendQueryParameter("directory", "0").build(), cqit.a, null, null, "sort_key");
            } else {
                bacfVar2 = new bacf(this.c, Uri.EMPTY, null, null, null, null);
            }
            return bacfVar2.b(this.f);
        }
        if (((crma) fcsuVar.b()).h()) {
            Uri uriBuild = ContactsContract.PhoneLookup.ENTERPRISE_CONTENT_FILTER_URI.buildUpon().appendPath(strB).build();
            bacfVar = new bacf(this.c, uriBuild, cqiv.a, null, null, null);
        } else {
            bacfVar = new bacf(this.c, Uri.EMPTY, null, null, null, null);
        }
        return bacfVar.b(this.f);
    }
}
