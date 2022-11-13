package quarkus;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;
//import javax.enterprise.inject.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Produces;

@Path("/accounts")
public class AccountResource 
{
    
    @GET
    @Produces (MediaType.APPLICATION_JSON)
    public Set<Account> allAccounts()
    {
        //return Collections.emptySet();
        return accounts;
    }

    Set<Account> accounts = new HashSet<>();

    @PostConstruct
    public void setup()
    {
        accounts.add(new Account(13456789L, 987654321L, "George Baird", new BigDecimal("354.23")));
        accounts.add(new Account(121212121L, 888777666L, "Mary Taylor", new BigDecimal("560.03")));
        accounts.add(new Account(545454545L, 222444999L, "Diana Rigg", new BigDecimal("422.00")));
        
    }
    
}
