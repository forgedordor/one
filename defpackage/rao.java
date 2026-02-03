package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public class rao extends rap {
    public rao(String str, qzt qztVar, qzs qzsVar) {
        super(str, qztVar, qzsVar);
    }

    @Override // defpackage.qzo
    protected final qzu b(qzk qzkVar) {
        String str;
        try {
            byte[] bArr = qzkVar.b;
            Map map = qzkVar.c;
            String str2 = "utf-8";
            if (map != null && (str = (String) map.get(ffho.a)) != null) {
                String[] strArrSplit = str.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= strArrSplit.length) {
                        break;
                    }
                    String[] strArrSplit2 = strArrSplit[i].trim().split("=", 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str2 = strArrSplit2[1];
                        break;
                    }
                    i++;
                }
            }
            return new qzu(new JSONObject(new String(bArr, str2)), raj.b(qzkVar));
        } catch (UnsupportedEncodingException e) {
            return new qzu(new qzm(e));
        } catch (JSONException e2) {
            return new qzu(new qzm(e2));
        }
    }
}
