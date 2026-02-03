package defpackage;

import android.app.Notification;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kwe {
    private final CharSequence a;
    private final long b;
    private final kxa c;
    private final Bundle d = new Bundle();
    private String e;
    private Uri f;

    public kwe(CharSequence charSequence, long j, kxa kxaVar) {
        this.a = charSequence;
        this.b = j;
        this.c = kxaVar;
    }

    static List b(Parcelable[] parcelableArr) {
        String str;
        String str2;
        kxa kxaVar;
        String str3 = "sender";
        String str4 = "sender_person";
        ArrayList arrayList = new ArrayList(parcelableArr.length);
        int i = 0;
        while (i < parcelableArr.length) {
            Parcelable parcelable = parcelableArr[i];
            if (parcelable instanceof Bundle) {
                Bundle bundle = (Bundle) parcelable;
                kwe kweVar = null;
                if (bundle.containsKey(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT) && bundle.containsKey("time")) {
                    if (bundle.containsKey("person")) {
                        kxaVar = kxa.b(bundle.getBundle("person"));
                    } else if (bundle.containsKey(str4) && Build.VERSION.SDK_INT >= 28) {
                        kxaVar = kwy.b(oc$$ExternalSyntheticApiModelOutline0.m((Object) bundle.getParcelable(str4)));
                    } else if (bundle.containsKey(str3)) {
                        kwz kwzVar = new kwz();
                        kwzVar.a = bundle.getCharSequence(str3);
                        kxaVar = new kxa(kwzVar);
                    } else {
                        kxaVar = null;
                    }
                    str = str3;
                    str2 = str4;
                    try {
                        kwe kweVar2 = new kwe(bundle.getCharSequence(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT), bundle.getLong("time"), kxaVar);
                        if (bundle.containsKey(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE) && bundle.containsKey(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI)) {
                            kweVar2.d(bundle.getString(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE), (Uri) bundle.getParcelable(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI));
                        }
                        if (bundle.containsKey("extras")) {
                            kweVar2.d.putAll(bundle.getBundle("extras"));
                        }
                        kweVar = kweVar2;
                    } catch (ClassCastException unused) {
                    }
                } else {
                    str = str3;
                    str2 = str4;
                }
                if (kweVar != null) {
                    arrayList.add(kweVar);
                }
            } else {
                str = str3;
                str2 = str4;
            }
            i++;
            str3 = str;
            str4 = str2;
        }
        return arrayList;
    }

    static Bundle[] c(List list) {
        Bundle[] bundleArr = new Bundle[list.size()];
        int size = list.size();
        for (int i = 0; i < size; i++) {
            kwe kweVar = (kwe) list.get(i);
            Bundle bundle = new Bundle();
            CharSequence charSequence = kweVar.a;
            if (charSequence != null) {
                bundle.putCharSequence(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, charSequence);
            }
            bundle.putLong("time", kweVar.b);
            kxa kxaVar = kweVar.c;
            if (kxaVar != null) {
                bundle.putCharSequence("sender", kxaVar.a);
                if (Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable("sender_person", kwy.a(kxaVar));
                } else {
                    bundle.putBundle("person", kxaVar.a());
                }
            }
            String str = kweVar.e;
            if (str != null) {
                bundle.putString(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, str);
            }
            Uri uri = kweVar.f;
            if (uri != null) {
                bundle.putParcelable(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
            }
            bundle.putBundle("extras", kweVar.d);
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }

    final Notification.MessagingStyle.Message a() {
        Notification.MessagingStyle.Message messageA;
        int i = Build.VERSION.SDK_INT;
        kxa kxaVar = this.c;
        if (i >= 28) {
            messageA = kwd.a(this.a, this.b, kxaVar != null ? kwy.a(kxaVar) : null);
        } else {
            messageA = kwc.a(this.a, this.b, kxaVar != null ? kxaVar.a : null);
        }
        String str = this.e;
        if (str != null) {
            kwc.b(messageA, str, this.f);
        }
        return messageA;
    }

    public final void d(String str, Uri uri) {
        this.e = str;
        this.f = uri;
    }
}
