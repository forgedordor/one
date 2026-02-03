package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tlx implements tlw {
    private final dakl a;

    public tlx(dakl daklVar) {
        this.a = daklVar;
    }

    @Override // defpackage.tlw
    public final Intent a(cplh cplhVar) {
        Intent data = new Intent("android.intent.action.INSERT").setData(CalendarContract.Events.CONTENT_URI);
        cpld cpldVar = (cpld) cplhVar;
        data.putExtra("beginTime", cpldVar.a.longValue());
        data.putExtra("endTime", cpldVar.b.longValue());
        String str = cpldVar.c;
        if (str != null) {
            data.putExtra(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE, str);
        }
        String str2 = cpldVar.d;
        if (str2 != null) {
            data.putExtra("description", str2);
        }
        String str3 = cpldVar.e;
        if (str3 != null) {
            data.putExtra("eventLocation", str3);
        }
        String str4 = cpldVar.f;
        if (str4 != null) {
            data.putExtra("rrule", str4);
        }
        return data;
    }

    @Override // defpackage.tlw
    public final void b(Context context, Uri uri) throws IOException {
        int i = bxli.a;
        cqaz.k(uri != null && TextUtils.equals(uri.getScheme(), "content") && uri.getAuthority().equals(bxlk.a(context)));
        try {
            Uri uriA = bxli.a(uri);
            if (uriA == null) {
                throw new FileNotFoundException(String.format("Invalid proxy uri : %s", uri.getPath()));
            }
            InputStream fileInputStream = bxlf.j(uriA, context) ? new FileInputStream(bxlf.h(uriA, context)) : bxli.c(context, uriA);
            try {
                cplh cplhVarC = new cplg().c(fileInputStream);
                if (cplhVarC == null) {
                    cqca.f("Bugle", "Return null for event from file!");
                    if (fileInputStream == null) {
                        return;
                    }
                } else {
                    this.a.o(context, a(cplhVarC));
                    if (fileInputStream == null) {
                        return;
                    }
                }
                fileInputStream.close();
            } finally {
            }
        } catch (IOException e) {
            cqca.h("Bugle", e, "Fail to read the calendar file");
        }
    }
}
