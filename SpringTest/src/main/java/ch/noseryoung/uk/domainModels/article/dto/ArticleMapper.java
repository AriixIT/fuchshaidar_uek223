package ch.noseryoung.uk.domainModels.article.dto;

import ch.noseryoung.uk.domainModels.article.Article;
import ch.noseryoung.uk.domainModels.authority.Authority;
import ch.noseryoung.uk.domainModels.authority.dto.AuthorityDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;
import java.util.Set;

@Mapper(componentModel="spring", unmappedTargetPolicy= ReportingPolicy.IGNORE)
public interface ArticleMapper {

    Article fromDTO(ArticleDTO dto);

    List<Article> fromDTOs(List<ArticleDTO> dtos);

    Set<Article> fromDTOs(Set<ArticleDTO> dtos);

    ArticleDTO toDTO(Article dm);

    List<ArticleDTO> toDTOs(List<Article> dms);

    Set<ArticleDTO> toDTOs(Set<Article> dms);
}
