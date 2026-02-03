package defpackage;

import android.app.appsearch.EmbeddingVector;
import android.app.appsearch.GenericDocument;
import android.os.Build;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class air {
    public static GenericDocument a(afv afvVar) {
        lcg.i(afvVar);
        GenericDocument.Builder builder = new GenericDocument.Builder(afvVar.l(), afvVar.k(), afvVar.m());
        builder.setScore(afvVar.b()).setTtlMillis(afvVar.e()).setCreationTimestampMillis(afvVar.c());
        for (String str : afvVar.o()) {
            Object objH = afvVar.h(str);
            if (objH instanceof String[]) {
                builder.setPropertyString(str, (String[]) objH);
            } else if (objH instanceof long[]) {
                builder.setPropertyLong(str, (long[]) objH);
            } else if (objH instanceof double[]) {
                builder.setPropertyDouble(str, (double[]) objH);
            } else if (objH instanceof boolean[]) {
                builder.setPropertyBoolean(str, (boolean[]) objH);
            } else if (objH instanceof byte[][]) {
                byte[][] bArr = (byte[][]) objH;
                if ((Build.VERSION.SDK_INT != 31 && Build.VERSION.SDK_INT != 32) || bArr.length != 0) {
                    builder.setPropertyBytes(str, bArr);
                }
            } else {
                if (objH instanceof afv[]) {
                    afv[] afvVarArr = (afv[]) objH;
                    if ((Build.VERSION.SDK_INT != 31 && Build.VERSION.SDK_INT != 32) || afvVarArr.length != 0) {
                        GenericDocument[] genericDocumentArr = new GenericDocument[afvVarArr.length];
                        for (int i = 0; i < afvVarArr.length; i++) {
                            genericDocumentArr[i] = a(afvVarArr[i]);
                        }
                        builder.setPropertyDocument(str, genericDocumentArr);
                    }
                } else {
                    if (!(objH instanceof aft[])) {
                        if (objH instanceof aeu[]) {
                            throw new UnsupportedOperationException("BLOB_STORAGE is not available on this AppSearch implementation.");
                        }
                        throw new IllegalStateException(String.format("Property \"%s\" has unsupported value type %s", str, objH.getClass().toString()));
                    }
                    if (!ajk.b()) {
                        throw new UnsupportedOperationException("SCHEMA_EMBEDDING_PROPERTY_CONFIG is not available on this AppSearch implementation.");
                    }
                    aiq.b(builder, str, (aft[]) objH);
                }
            }
        }
        return builder.build();
    }

    public static afv b(GenericDocument genericDocument) {
        lcg.i(genericDocument);
        afu afuVar = new afu(genericDocument.getNamespace(), genericDocument.getId(), genericDocument.getSchemaType());
        afuVar.c(genericDocument.getScore()).d(genericDocument.getTtlMillis()).g(genericDocument.getCreationTimestampMillis());
        for (String str : genericDocument.getPropertyNames()) {
            Object property = genericDocument.getProperty(str);
            if (str.equals("$$__AppSearch__parentTypes")) {
                if (!(property instanceof String[])) {
                    throw new IllegalStateException(String.format("Parents list must be of String[] type, but got %s", property.getClass().toString()));
                }
                afuVar.a.c(Arrays.asList((String[]) property));
            } else if (property instanceof String[]) {
                afuVar.b(str, (String[]) property);
            } else if (property instanceof long[]) {
                afuVar.k(str, (long[]) property);
            } else if (property instanceof double[]) {
                afuVar.j(str, (double[]) property);
            } else if (property instanceof boolean[]) {
                afuVar.h(str, (boolean[]) property);
            } else if (property instanceof byte[][]) {
                afuVar.i(str, (byte[][]) property);
            } else if (property instanceof GenericDocument[]) {
                GenericDocument[] genericDocumentArr = (GenericDocument[]) property;
                afv[] afvVarArr = new afv[genericDocumentArr.length];
                for (int i = 0; i < genericDocumentArr.length; i++) {
                    afvVarArr[i] = b(genericDocumentArr[i]);
                }
                afuVar.a(str, afvVarArr);
            } else {
                if (!ajk.b() || !(property instanceof EmbeddingVector[])) {
                    throw new IllegalStateException(String.format("Property \"%s\" has unsupported value type %s", str, property.getClass().toString()));
                }
                aiq.a(afuVar, str, (EmbeddingVector[]) property);
            }
        }
        return afuVar.e();
    }
}
